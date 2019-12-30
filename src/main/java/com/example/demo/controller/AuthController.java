package com.example.demo.controller;

import com.example.demo.Exception.ExceptionCast;
import com.example.demo.contance.AuthCode;
import com.example.demo.model.AuthToken;
import com.example.demo.pojo.request.LoginRequest;
import com.example.demo.pojo.response.CommonCode;
import com.example.demo.pojo.response.LoginResult;
import com.example.demo.pojo.response.ResponseResult;
import com.example.demo.service.AuthService;
import com.example.demo.untils.CookieUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AuthController implements AuthControllerApi {

    @Value("${auth.clientId}")

    String clientId;

    @Value("${auth.clientSecret}")

    String clientSecret;

    @Value("${auth.cookieDomain}")
    String cookieDomain;
    @Value("${auth.cookieMaxAge}")
    int cookieMaxAge;
    @Value("${auth.tokenValiditySeconds}")
    int tokenValiditySeconds;
    @Autowired
    AuthService authService;

    @Override
    @PostMapping("/userlogin")
    public LoginResult login(LoginRequest loginRequest) {
        //校验账号是否输入  
        if (loginRequest == null || StringUtils.isEmpty(loginRequest.getUsername())) {

            ExceptionCast.cast(AuthCode.AUTH_USERNAME_NONE);
        }
        //校验密码是否输入  
        if (StringUtils.isEmpty(loginRequest.getPassword())) {

            ExceptionCast.cast(AuthCode.AUTH_PASSWORD_NONE);
        }
        AuthToken authToken = authService.login(loginRequest.getUsername(), loginRequest.getPassword(), clientId, clientSecret);
        //将令牌写入cookie  
        //访问token  
        String access_token = authToken.getAccess_token();
        //将访问令牌存储到cookie  
        saveCookie(access_token);
        return new LoginResult(CommonCode.SUCCESS, access_token);
    }

    //将令牌保存到cookie
    private void saveCookie(String token) {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        //添加cookie  认证令牌，最后一个参数设置为false，表示允许浏览器获取  
        CookieUtil.addCookie(response, cookieDomain, "/", "uid", token, cookieMaxAge, false);
    }

    @Override
    @PostMapping("/userlogout")
    public ResponseResult logout() {
        return null;
    }
}
