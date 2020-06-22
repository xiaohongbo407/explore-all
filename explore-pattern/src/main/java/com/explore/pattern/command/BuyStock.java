package com.explore.pattern.command;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/19 12:17
 **/
public class BuyStock implements  Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
