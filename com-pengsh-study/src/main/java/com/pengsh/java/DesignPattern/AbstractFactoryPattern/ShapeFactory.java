package com.pengsh.java.DesignPattern.AbstractFactoryPattern;


/**
 * @author pengsh
 * @Date: 2020/8/27 10:05
 */
public class ShapeFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape){
            case "CIRCLE":  return new Circle();
            case "RECTANGLE":  return new Rectangle();
            case "SQUARE":  return new Square();
            default: return  null;
        }
    }
}
