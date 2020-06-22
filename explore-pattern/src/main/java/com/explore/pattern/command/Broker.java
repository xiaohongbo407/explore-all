package com.explore.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/19 12:19
 **/
public class Broker {

    private List<Order> orderList =  new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }

}
