package com.pengsh.java.jvm.Thread;

/**
 * @Author pengsh
 * @Date: 2021/03/22
 * @Description
 */
public class ThreadMain {
    public static void main(String[] args) throws Exception {
        /**
         * 线程开始测试
         */
        ThreadThree threadThree=new ThreadThree();
        threadThree.call();
        ThreadTwo threadTwo=new ThreadTwo();
        threadTwo.run();
        ThreadOne threadOne=new ThreadOne();
        threadOne.start();
    }
}
