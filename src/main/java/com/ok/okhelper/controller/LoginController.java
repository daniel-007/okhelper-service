package com.ok.okhelper.controller;

import com.ok.okhelper.common.ServerResponse;
import com.ok.okhelper.service.UserService;
import com.ok.okhelper.until.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 21:56 2018/4/9
*/
@RestController
public class LoginController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public ServerResponse loginUser(String username, String password, HttpServletRequest request) {
        String ip = IpUtil.getIpAddr(request);
        return userService.loginUser(username, password, ip);
}

    @RequestMapping("/logout")
    public Object logOut(HttpSession session) {
//        Subject subject = SecurityUtils.getSubject();
//        subject.logout();
//        session.removeAttribute("user");
        return "登出";
    }


    //    @RequiresAuthentication
    @GetMapping("/test")
    public String test() {
        return "ok";
    }
}