package com.pengsh.java.DesignPattern.FactoryPattern;

/**
 * @author pengsh
 * @Date: 2020/8/25 15:52
 *
 * 工厂模式的容器
 */
public class ShapeFactoryContext {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){

        switch (shapeType){
            case "CIRCLE":  return new Circle();
            case "RECTANGLE":  return new Rectangle();
            case "SQUARE":  return new Square();
            default: return  null;
        }

    /*    if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
*/
    }
}
