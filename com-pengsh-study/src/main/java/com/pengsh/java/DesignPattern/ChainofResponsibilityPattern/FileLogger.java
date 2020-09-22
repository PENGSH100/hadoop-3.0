package com.pengsh.java.DesignPattern.ChainofResponsibilityPattern;

/**
 * @author pengsh
 * @Date 2020/9/9
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
