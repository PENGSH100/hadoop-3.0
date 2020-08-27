package com.pengsh.java.DesignPattern.SingleMode;

/**
 * @author pengsh
 * @Date: 2020/8/24 15:44
 * 懒汉式 线程不安全
 */
public class SingletOnLazy {
    public static SingletOnLazy singletOnLazy;

    public SingletOnLazy() {
    }

    public SingletOnLazy getInstance(String threadName) {
        if (singletOnLazy == null) {
            System.out.println("初始化这个对象了"+threadName);
            singletOnLazy = new SingletOnLazy();
        }else {
            System.out.println("这个对象已经存在"+threadName);
        }
        return singletOnLazy;
    }
}
