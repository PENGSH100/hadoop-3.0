package com.pengsh.java.DesignPattern.CommandPattern;

/**
 * @author pengsh
 * @Date 2020/9/23
 */
public class CommandPatternMain {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
