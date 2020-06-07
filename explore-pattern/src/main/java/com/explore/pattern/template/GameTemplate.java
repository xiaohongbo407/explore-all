package com.explore.pattern.template;

/**
 * 模板模式 抽象类
 * @Author XiaoHB
 * @date
 **/
public abstract class GameTemplate {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}
