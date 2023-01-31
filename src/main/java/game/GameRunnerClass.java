package game;

import com.example.springFramework.game.MarioGame;

public class GameRunnerClass {
    MarioGame game;
    public GameRunnerClass(MarioGame game) {
        this.game =game;
    }

    public void run() {
        System.out.println("Running game: "+game);
    }
}
