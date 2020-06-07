package com.explore.pattern.state;

/**
 * 状态模式的当前上下文 {@link State}
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/7 19:06
 **/
public class StateContext {
    private State state;

    public StateContext(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
