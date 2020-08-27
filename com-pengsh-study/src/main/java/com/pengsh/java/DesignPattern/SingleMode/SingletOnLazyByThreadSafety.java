package com.pengsh.java.DesignPattern.SingleMode;

/**
 * @author pengsh
 * @Date: 2020/8/24 16:10
 * 懒汉式 加锁 线程安全
 */
public class SingletOnLazyByThreadSafety {
    public  static SingletOnLazyByThreadSafety singletOnLazyByThreadSafety;

    public SingletOnLazyByThreadSafety() {
    }
    public static synchronized SingletOnLazyByThreadSafety getInstance(){
        if(singletOnLazyByThreadSafety ==null){
            singletOnLazyByThreadSafety =new SingletOnLazyByThreadSafety();

        }
        return singletOnLazyByThreadSafety;
    }
}
