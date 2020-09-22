package com.pengsh.java.DesignPattern.ChainofResponsibilityPattern;

/**
 * @author pengsh
 * @Date 2020/9/9
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
