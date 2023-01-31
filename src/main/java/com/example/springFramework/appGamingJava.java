package com.example.springFramework;

import com.example.springFramework.game.MarioGame;
import game.GameRunnerClass;

public class appGamingJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunnerClass = new GameRunnerClass(marioGame);
        gameRunnerClass.run();

        marioGame.left();
    }
}
