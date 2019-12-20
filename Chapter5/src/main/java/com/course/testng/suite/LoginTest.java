package com.course.testng.suite;

import org.testng.annotations.Test;

//test标签下面包含的方法
public class LoginTest {
    @Test
    public void loginTaoBao(){
        System.out.println("淘宝登录成功");
    }
}
