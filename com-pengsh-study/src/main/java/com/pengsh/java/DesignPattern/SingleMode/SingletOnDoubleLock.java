package com.pengsh.java.DesignPattern.SingleMode;

/**
 * @author pengsh
 * @Date: 2020/8/25 15:34
 * 双重加锁模式 线程安全 是饿汉式的一种加锁变形
 */
public class SingletOnDoubleLock {
    private volatile static SingletOnDoubleLock singletOnDoubleLock;
    private SingletOnDoubleLock (){}
    public static SingletOnDoubleLock getSingleton() {
        if (singletOnDoubleLock == null) {
            synchronized (SingletOnDoubleLock.class) {
                if (singletOnDoubleLock == null) {
                    singletOnDoubleLock = new SingletOnDoubleLock();
                }
            }
        }
        return singletOnDoubleLock;
    }
}
