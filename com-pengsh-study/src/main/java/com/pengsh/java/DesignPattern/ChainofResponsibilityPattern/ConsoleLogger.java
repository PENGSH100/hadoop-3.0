package com.pengsh.java.DesignPattern.ChainofResponsibilityPattern;

/**
 * @author pengsh
 * @Date 2020/9/9
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
