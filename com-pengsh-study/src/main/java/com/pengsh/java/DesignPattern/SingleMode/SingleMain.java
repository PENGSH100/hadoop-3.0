package com.pengsh.java.DesignPattern.SingleMode;

/**
 * @author pengsh
 * @Date: 2020/8/24 15:40
 */
public class SingleMain {
    public static void main(String[] args) throws InterruptedException {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object1 = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    SingletOnLazy singletOnLazy = new SingletOnLazy();
                    singletOnLazy.getInstance(Thread.currentThread().getName());
                    System.gc();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    SingletOnLazy singletOnLazy = new SingletOnLazy();
                    singletOnLazy.getInstance(Thread.currentThread().getName());
                }
            }
        }).start();
        Thread.sleep(10000);

    }
}
