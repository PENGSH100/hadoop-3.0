package com.pengsh.java.DesignPattern.AbstractFactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 10:03
 */
public   interface AbstractFactory {
   Color getColor(String color);
   Shape getShape(String shape) ;
}
