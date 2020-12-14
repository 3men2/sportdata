package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.impl.FinishGameService;
import com.sportdata.fifaworldcup.service.impl.StartGameService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FinishGameServiceTest {

    IStartGameService startGameService;

    IFinishGameService finishGameService;

    @Before
    public void setUp() {
        startGameService = new StartGameService();
        finishGameService = new FinishGameService();
    }

    @Test
    public void removeGameFromScoreBoard_shouldReturnOK() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Game game = new Game("SPAIN", "FRANCE");
        startGameService.addGameToScoreBoard(scoreBoard, game);
        boolean result = finishGameService.removeGameFromScoreBoard(scoreBoard, game);
        Assert.assertTrue(scoreBoard.getGames().isEmpty());
        Assert.assertEquals(result, true);
    }

    @Test
    public void removeGameThatIsNotInScoreBoard_shouldReturnKO() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Game game = new Game("SPAIN", "FRANCE");
        boolean result = finishGameService.removeGameFromScoreBoard(scoreBoard, game);
        Assert.assertTrue(scoreBoard.getGames().isEmpty());
        Assert.assertEquals(result, false);
    }
}
