package com.example.demo.controller;

import com.example.demo.model.XcUserExt;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ucenter")
public class UcenterController implements UcenterControllerApi {
    @Autowired
    UserService userService;

    @GetMapping("/getuserext")
    @Override
    public XcUserExt getUserext(@RequestParam("username") String username) {
        XcUserExt xcUser = userService.getUserExt(username);
        return xcUser;
    }
}
