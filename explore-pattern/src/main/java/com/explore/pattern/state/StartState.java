package com.explore.pattern.state;

/**
 * 开始状态 {@link State}
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/7 19:08
 **/
public class StartState implements State {

    @Override
    public void doAction(StateContext stateContext) {
        System.out.println("Player is in start state");
        stateContext.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }

}
