package com.pengsh.java.DesignPattern.FactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/25 15:56
 */
public class FactoryPatternMain {
    public static void main(String[] args) {
        ShapeFactoryContext shapeFactory = new ShapeFactoryContext();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
