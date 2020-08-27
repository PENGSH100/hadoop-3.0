package com.pengsh.java.DesignPattern.BuilderPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 17:39
 */
public class ChickenBurger extends  Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
