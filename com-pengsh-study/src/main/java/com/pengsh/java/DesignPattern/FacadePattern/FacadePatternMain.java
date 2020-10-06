package com.pengsh.java.DesignPattern.FacadePattern;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public class FacadePatternMain {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
