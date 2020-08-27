package com.pengsh.java.DesignPattern.StrategyMode;

/**
 * @author pengsh
 * @Date: 2020/8/24 15:01
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
