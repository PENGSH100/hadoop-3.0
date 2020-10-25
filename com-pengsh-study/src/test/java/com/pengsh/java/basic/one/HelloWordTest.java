package com.pengsh.java.basic.one;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author pengsh
 * @date 2020/10/6 20:54
 */
public class HelloWordTest {
    @BeforeClass
    public static void init(){
        System.out.println("haha");
        System.setProperty("process.profile", "fstest");

    }
    @Before
    public void before(){
        System.out.println("haha");
    }
    @Test
    public void test() {
        System.out.println("ceshiyxia");
    }

}