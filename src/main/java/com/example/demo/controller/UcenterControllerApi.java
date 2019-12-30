package com.example.demo.controller;

import com.example.demo.model.XcUserExt;
import io.swagger.annotations.Api;

@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterControllerApi {

    public XcUserExt getUserext(String username);
}
