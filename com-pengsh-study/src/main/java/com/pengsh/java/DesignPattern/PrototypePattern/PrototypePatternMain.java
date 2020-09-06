package com.pengsh.java.DesignPattern.PrototypePattern;

public class PrototypePatternMain {
    public static void main(String[] args) {
        ShapeCacheContext.loadCache();

        Shape clonedShape = (Shape) ShapeCacheContext.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCacheContext.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCacheContext.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
