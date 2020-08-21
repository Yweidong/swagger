package com.dongdong.swagger.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: swagger
 * @description:
 * @author: zxb
 * @create: 2020-08-21 12:27
 **/
@RestController
@RequestMapping("/api/v1")
@Api(tags = "用户接口")
public class UserController {
    @GetMapping("/user")
    @ApiOperation(value = "查询用户")
    public Map<String,Object> findAll() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","dong");
        return map;
    }

    @PostMapping("/save")
    @ApiOperation(value = "保存用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value = "用户id",dataType = "string",paramType = "body"),
            @ApiImplicitParam(name="name",value = "用户名",dataType = "string",paramType = "body")

    })
    @ApiResponses({
            @ApiResponse(code=200,message = "响应成功")
    })
    public Map<String,Object> save(String id,String name) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","dong");
        return map;
    }
}
