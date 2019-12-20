package com.course.testng;

import org.testng.annotations.Test;

/**
 * 什么时候会用到异常测试？
 * 在我们期望结果为一个异常的时候
 * 比如：我们传入了某些不合法的参数，程序抛出了异常
 * 也就是说我的预期结果就是这个异常
 */
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void test1(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void test2(){
        System.out.println("这是一个成功");
        throw new RuntimeException();
    }
}
