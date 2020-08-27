package com.pengsh.java.DesignPattern.BuilderPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 17:24
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
