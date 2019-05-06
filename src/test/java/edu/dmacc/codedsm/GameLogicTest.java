package edu.dmacc.codedsm;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class GameLogicTest {

    @Before

    public void setUp() throws Exception {
    }

    @Test
    public void isVictorious() {
        StubGameRunner stubGameRummer = new StubGameRunner() {

            @Override
            public boolean isVictorious() {
                return true;
            }
        };

        GameLogic gameLogic = new GameLogic(stubGameRummer);

        GameResult gameResult = gameLogic.runGame("Sheryl");

        assertEquals(10000, gameResult.getScore().intValue());
    }

    @Test
    public void isDefeated() {

        StubGameRunner stubGameRummer = new StubGameRunner() {
            @Override
            public boolean isDefeated() {
                return true;
            }
        };

        GameLogic gameLogic = new GameLogic(stubGameRummer);

        GameResult gameResult = gameLogic.runGame("Dale");

        assertEquals(100, gameResult.getScore().intValue());

    }



    @Test
    public void playerName() {

        StubGameRunner stubGameRunner = new StubGameRunner() {
            @Override
            public boolean isVictorious() {
                return true;
            }
        };
        GameLogic gameLogic = new GameLogic(stubGameRunner);
        GameResult gameResult = gameLogic.runGame("Jeremy");
        assertEquals("Jeremy", gameResult.getPlayer());
    }

    private class StubGameRunner implements GameRunner {
        public boolean isVictorious() {
            return false;
        }

        public boolean isDefeated() {
            return false;
        }

    }
}

