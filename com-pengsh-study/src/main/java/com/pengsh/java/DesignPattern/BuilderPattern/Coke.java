package com.pengsh.java.DesignPattern.BuilderPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 17:39
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
