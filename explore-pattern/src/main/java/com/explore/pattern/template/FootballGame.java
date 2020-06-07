package com.explore.pattern.template;

/**
 * @Author XiaoHB
 * @date 2020/6/7 18:58
 **/
public class FootballGame extends GameTemplate{

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
