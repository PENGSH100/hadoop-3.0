package com.pengsh.java.DesignPattern.AbstractFactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/25 15:49
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
