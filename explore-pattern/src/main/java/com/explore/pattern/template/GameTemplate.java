package com.explore.pattern.template;

/**
 * 模板模式 抽象类
 * @Author XiaoHB
 * @date
 **/
public abstract class GameTemplate {
    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    //模板执行流程
    public final void play() {
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}
