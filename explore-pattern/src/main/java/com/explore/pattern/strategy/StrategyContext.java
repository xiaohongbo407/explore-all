package com.explore.pattern.strategy;

/**
 * 策略模式上下文 {@link Strategy}
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/7 21:13
 **/
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }

}
