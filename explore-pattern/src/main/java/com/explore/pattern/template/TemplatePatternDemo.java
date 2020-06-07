package com.explore.pattern.template;

/**
 * @author XiaoHB
 * @date
 **/

public class TemplatePatternDemo {

    public static void main(String[] args) {
        GameTemplate game = new CircketGame();
        game.play();
        System.out.println();

        game = new FootballGame();
        game.play();

    }
}
