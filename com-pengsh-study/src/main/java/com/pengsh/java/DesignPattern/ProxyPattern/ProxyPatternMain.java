package com.pengsh.java.DesignPattern.ProxyPattern;

/**
 * @author pengsh
 * @Date 2020/9/9
 */
public class ProxyPatternMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("==================");
        // 图像不需要从磁盘加载
        image.display();
    }
}
