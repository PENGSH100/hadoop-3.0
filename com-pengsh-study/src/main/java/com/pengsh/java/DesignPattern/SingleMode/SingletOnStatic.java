package com.pengsh.java.DesignPattern.SingleMode;

/**
 * @author pengsh
 * @Date: 2020/8/25 15:41
 * 匿名静态内部类的方式。
 */
public class SingletOnStatic {
    private static class SingletonHolder {
        private static final SingletOnStatic INSTANCE = new SingletOnStatic();
    }
    private SingletOnStatic (){}
    public static final SingletOnStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
