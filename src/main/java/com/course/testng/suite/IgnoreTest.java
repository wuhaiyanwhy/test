package com.course.testng.suite;

import jdk.internal.instrumentation.TypeMapping;
import org.testng.annotations.Test;

//忽略测试
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled = false)
    public void ignore(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }

}
