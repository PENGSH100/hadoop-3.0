package com.pengsh.java.DesignPattern.StrategyMode;

/**
 * @author pengsh
 * @Date: 2020/8/24 15:03
 * 策略模式的容器
 */
public class StrategyContext {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
