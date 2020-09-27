package com.pengsh.java.DesignPattern.DecoratorPattern;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
