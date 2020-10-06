package com.pengsh.java.DesignPattern.BridgePattern;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public class BridgePatternMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
