package com.pengsh.java.DesignPattern.DecoratorPattern;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
