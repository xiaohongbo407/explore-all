package com.explore.pattern.strategy;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/7 21:14
 **/
public class StrategyPatternDemo {

    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(new OperationAdd());
        System.out.println("10 + 5 = "+ strategyContext.executeStrategy(10,5));

    }
}
