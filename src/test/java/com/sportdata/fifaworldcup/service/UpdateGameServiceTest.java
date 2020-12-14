package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.impl.StartGameService;
import com.sportdata.fifaworldcup.service.impl.UpdateGameService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UpdateGameServiceTest {

    IStartGameService startGameService;

    IUpdateGameService updateGameService;

    @Before
    public void setUp() {
        startGameService = new StartGameService();
        updateGameService = new UpdateGameService();
    }

    @Test
    public void removeGameFromScoreBoard_shouldReturnOK() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Game gameOne = new Game("SPAIN", "FRANCE");
        Game gameTwo = new Game("SPAIN", "FRANCE");
        startGameService.addGameToScoreBoard(scoreBoard, gameOne);
        gameTwo.setHomeTeamScore(1);
        gameTwo.setTotalScore(1);
        boolean result = updateGameService.updateGameOnScoreBoard(scoreBoard, gameTwo);
        Assert.assertEquals(scoreBoard.getGames().size(), 1);
        Assert.assertEquals(result, true);
    }

    @Test
    public void removeGameFromScoreBoard_shouldReturnKO() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Game gameOne = new Game("SPAIN", "FRANCE");
        Game gameTwo = new Game("SPAIN", "BRAZIL");
        startGameService.addGameToScoreBoard(scoreBoard, gameOne);
        gameTwo.setHomeTeamScore(1);
        gameTwo.setTotalScore(1);
        boolean result = updateGameService.updateGameOnScoreBoard(scoreBoard, gameTwo);
        Assert.assertEquals(scoreBoard.getGames().size(), 1);
        Assert.assertEquals(result, false);
    }
}
