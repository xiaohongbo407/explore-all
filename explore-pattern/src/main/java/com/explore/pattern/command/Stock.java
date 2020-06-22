package com.explore.pattern.command;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/19 12:15
 **/
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+ name +", Quantity: "+ quantity + " ] bought ");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+ name +", Quantity: "+ quantity + " ] sold ");
    }

}
