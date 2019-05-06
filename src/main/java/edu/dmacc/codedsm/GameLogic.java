package edu.dmacc.codedsm;

public class GameLogic {

    private GameRunner runner;

    public GameLogic(GameRunner runner) {
        this.runner = runner;
    }

    public GameResult runGame(String playerName) {  //ut
        Integer score = runGame();

        GameResult result = buildResult(playerName, score);

        return result;
    }

    public GameResult buildResult(String playerName, Integer score) {//ut
        GameResult result = new GameResult();
        result.setPlayer(playerName);
        result.setScore(score);

        return result;
    }

    private Integer runGame() {
        Integer score = 0; //ut
        if (runner.isVictorious()) {
            score = 10000;  //ut
        } else if (runner.isDefeated()) {
            score = 100;  //ut
        }

        return score;
    }

}
