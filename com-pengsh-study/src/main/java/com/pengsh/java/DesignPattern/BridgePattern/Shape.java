package com.pengsh.java.DesignPattern.BridgePattern;

/**
 * @author pengsh
 * @Date 2020/9/8
 */
public abstract  class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
