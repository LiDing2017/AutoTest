package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//测试套件配置
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforesuit运行了");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("aftersuit运行了");
    }
    @BeforeTest
    public void test(){
        System.out.println("beforetest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("aftertest");
    }

}
