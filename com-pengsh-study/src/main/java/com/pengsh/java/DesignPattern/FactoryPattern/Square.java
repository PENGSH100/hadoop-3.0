package com.pengsh.java.DesignPattern.FactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/25 15:50
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
