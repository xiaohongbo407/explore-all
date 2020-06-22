package com.explore.pattern.command;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/19 12:18
 **/
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
