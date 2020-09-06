package com.pengsh.java.DesignPattern.AbstractFactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 9:59
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
