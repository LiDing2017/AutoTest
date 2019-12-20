package com.tester.extend.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestMethodsDemo {

    @Test
    public void test1(){
        assertEquals(1,2);
    }
    @Test
    public void test2(){
        assertEquals(1,1);
    }
    @Test
    public void test3(){
        assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是自己写的一个日志文件");
        throw new RuntimeException("这是自己定义的运行时异常");
    }

}
