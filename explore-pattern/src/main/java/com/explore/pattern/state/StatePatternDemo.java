package com.explore.pattern.state;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/7 19:12
 **/
public class StatePatternDemo {

    public static void main(String[] args) {
        StateContext stateContext = new StateContext();

        StartState startState =  new StartState();
        startState.doAction(stateContext);

        System.out.println(stateContext.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(stateContext);

        System.out.println(stateContext.getState().toString());
    }

}
