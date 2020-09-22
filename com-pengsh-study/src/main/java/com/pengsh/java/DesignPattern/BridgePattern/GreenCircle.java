package com.pengsh.java.DesignPattern.BridgePattern;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
