package com.pengsh.java.DesignPattern.AbstractFactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 10:02
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
