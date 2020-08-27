package com.pengsh.java.DesignPattern.AbstractFactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 10:03
 */
public abstract  interface AbstractFactory {
  public abstract   Color getColor(String color);
  public abstract Shape getShape(String shape) ;
}
