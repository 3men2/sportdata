package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.impl.StartGameService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StartGameServiceTest {

    private IStartGameService startGameService;

    @Before
    public void setUp() {
        startGameService = new StartGameService();
    }

    @Test
    public void startGameWithValues_shouldReturnOK() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Game game = new Game("SPAIN", "FRANCE");
        boolean result = startGameService.addGameToScoreBoard(scoreBoard, game);
        Assert.assertEquals(scoreBoard.getGames().size(), 1);
        Assert.assertEquals(result, true);
    }

}
