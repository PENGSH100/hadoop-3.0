package com.pengsh.java.DesignPattern.FactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/25 15:51
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
