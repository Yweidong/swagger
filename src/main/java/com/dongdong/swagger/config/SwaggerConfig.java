package com.dongdong.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: swagger
 * @description:  swagger配置类
 * @author: zxb
 * @create: 2020-08-21 11:51
 **/
@Configuration
@EnableSwagger2//开启swagger
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                    .pathMapping("/")
                    .select()
                    //扫描接口的包
                    .apis(RequestHandlerSelectors.basePackage("com.dongdong.swagger.controller"))
                    .paths(PathSelectors.any())
                    .build().apiInfo(new ApiInfoBuilder()
                            .title("springboot整合swagger")//接口文档标题
                            .description("===========")//详细信息
                            .version("1.0")
                            //个人信息
                            .contact(new Contact("dong","www.dongdong.com","1371690$83@qq.com"))
                            .build()
                );
    }
}
