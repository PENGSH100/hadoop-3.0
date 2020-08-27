package com.pengsh.java.DesignPattern.AbstractFactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/27 10:12
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color){
            case "RED":  return new Red();
            case "GREEN":  return new Green();
            case "BLUE":  return new Blue();
            default: return  null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
