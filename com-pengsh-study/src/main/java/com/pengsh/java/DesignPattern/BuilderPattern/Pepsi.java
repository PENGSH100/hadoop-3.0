package com.pengsh.java.DesignPattern.BuilderPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 17:40
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
