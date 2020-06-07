package com.explore.pattern.state;

/**
 * 状态模式 {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/7 19:06
 **/
public interface State {
    public void doAction(StateContext stateContext);
}
