package com.example.demo.controller;

import com.example.demo.model.XcUserExt;
import com.example.demo.pojo.request.LoginRequest;
import com.example.demo.pojo.response.LoginResult;
import com.example.demo.pojo.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户认证",description = "用户认证接口")
public interface AuthControllerApi {
    @ApiOperation("登录")
    public LoginResult login(LoginRequest loginRequest);

    @ApiOperation("退出")
    public ResponseResult logout();



}
