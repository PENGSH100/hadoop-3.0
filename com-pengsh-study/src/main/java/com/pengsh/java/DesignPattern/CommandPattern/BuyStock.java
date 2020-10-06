package com.pengsh.java.DesignPattern.CommandPattern;

/**
 * @author pengsh
 * @Date 2020/9/23
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
