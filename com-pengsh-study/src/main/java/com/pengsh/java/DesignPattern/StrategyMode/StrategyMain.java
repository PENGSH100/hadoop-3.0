package com.pengsh.java.DesignPattern.StrategyMode;

/**
 * @author pengsh
 * @Date: 2020/8/24 15:07
 */
public class StrategyMain {
    public static void main(String[] args) {
        //这个是一个策略的方式
        StrategyContext strategy = new StrategyContext((a, b) -> {
            return a + b;
        });
        StrategyContext strategy1 = new StrategyContext(new OperationAdd());
        System.out.println(strategy.executeStrategy(1,2));
    }
}
