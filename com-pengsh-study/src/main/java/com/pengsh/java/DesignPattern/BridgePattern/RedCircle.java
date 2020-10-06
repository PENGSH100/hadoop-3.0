package com.pengsh.java.DesignPattern.BridgePattern;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
