package com.pengsh.java.DesignPattern.BuilderPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 17:20
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
