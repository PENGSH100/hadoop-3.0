package com.pengsh.java.DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengsh
 * @Date 2020/9/23
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
