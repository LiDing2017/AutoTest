package com.course.server;

import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class MyGetMethod {
    @GetMapping(value = "/getCookies")
    public String getCookies(HttpServletResponse response){
        //HttpServerletRequest 装请求信息的类
        //HttpServerletResponse 装响应信息的类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜你获取cookies成功";
    }
    //要求客户端携带cookies访问
    //这是一个需要携带cookies信息才能访问的get请求
    @GetMapping(value = "/get/with/cookies")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        System.out.println(cookies);
        if (ObjectUtils.isEmpty(cookies)) {
            return "你必须携带cookies来";
        }
        for (Cookie cookie: cookies
             ) {
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                return "恭喜你访问成功";
            }

        }
        return "你必须携带cookies来";
    }

}
