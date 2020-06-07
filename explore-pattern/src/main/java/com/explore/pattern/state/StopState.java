package com.explore.pattern.state;

/**
 * 停止状态 {@link State}
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/7 19:11
 **/
public class StopState implements State {

    @Override
    public void doAction(StateContext stateContext) {
        System.out.println("Player is in stop state");
        stateContext.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
