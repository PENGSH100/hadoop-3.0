package com.pengsh.java.DesignPattern.BuilderPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 17:23
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
