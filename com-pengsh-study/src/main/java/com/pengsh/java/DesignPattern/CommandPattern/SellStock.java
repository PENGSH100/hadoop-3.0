package com.pengsh.java.DesignPattern.CommandPattern;

/**
 * @author pengsh
 * @Date 2020/9/23
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
