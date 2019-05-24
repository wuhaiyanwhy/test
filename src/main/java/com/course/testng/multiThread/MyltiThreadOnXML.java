//多线程测试，适用于压力测试


package com.course.testng.multiThread;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;

public class MyltiThreadOnXML {

    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread());
    }

    @Test
    public void test2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread());
    }

    @Test
    public void test3(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread());
    }

}
