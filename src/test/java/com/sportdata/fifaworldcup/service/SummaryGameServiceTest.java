package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.impl.StartGameService;
import com.sportdata.fifaworldcup.service.impl.SummaryGameService;
import com.sportdata.fifaworldcup.service.impl.UpdateGameService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SummaryGameServiceTest {

    IStartGameService startGameService;

    ISummaryGameService summaryGameService;

    IUpdateGameService updateGameService;

    @Before
    public void setUp() {
        startGameService = new StartGameService();
        summaryGameService = new SummaryGameService();
        updateGameService = new UpdateGameService();
    }

    @Test
    public void getSummaryFromScoreBoard_shouldReturnOK_2_2() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Game gameOne = new Game("MEXICO", "CANADA");
        startGameService.addGameToScoreBoard(scoreBoard, gameOne);
        gameOne.setAwayTeamScore(5);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameOne);
        Game gameTwo = new Game("SPAIN", "BRAZIL");
        startGameService.addGameToScoreBoard(scoreBoard, gameTwo);
        gameTwo.setHomeTeamScore(10);
        gameTwo.setAwayTeamScore(2);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameTwo);
        Game gameThree = new Game("GERMANY", "FRANCE");
        startGameService.addGameToScoreBoard(scoreBoard, gameThree);
        gameThree.setHomeTeamScore(2);
        gameThree.setAwayTeamScore(2);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameThree);
        Game gameFourth = new Game("URUGUAY", "ITALY");
        startGameService.addGameToScoreBoard(scoreBoard, gameFourth);
        gameFourth.setHomeTeamScore(6);
        gameFourth.setAwayTeamScore(6);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameFourth);
        Game gameFifth = new Game("ARGENTINA", "AUSTRALIA");
        startGameService.addGameToScoreBoard(scoreBoard, gameFifth);
        gameFifth.setHomeTeamScore(3);
        gameFifth.setAwayTeamScore(1);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameFifth);
        String result = summaryGameService.getSummaryFromScoreBoard(scoreBoard);
        Assert.assertTrue(result.endsWith("2-2\n"));
    }

    @Test
    public void getSummaryFromScoreBoard_shouldReturnOK_3_1() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Game gameOne = new Game("MEXICO", "CANADA");
        startGameService.addGameToScoreBoard(scoreBoard, gameOne);
        gameOne.setAwayTeamScore(5);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameOne);
        Game gameTwo = new Game("SPAIN", "BRAZIL");
        startGameService.addGameToScoreBoard(scoreBoard, gameTwo);
        gameTwo.setHomeTeamScore(10);
        gameTwo.setAwayTeamScore(2);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameTwo);
        Game gameThree = new Game("GERMANY", "FRANCE");
        startGameService.addGameToScoreBoard(scoreBoard, gameThree);
        gameThree.setHomeTeamScore(5);
        gameThree.setAwayTeamScore(2);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameThree);
        Game gameFourth = new Game("URUGUAY", "ITALY");
        startGameService.addGameToScoreBoard(scoreBoard, gameFourth);
        gameFourth.setHomeTeamScore(6);
        gameFourth.setAwayTeamScore(6);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameFourth);
        Game gameFifth = new Game("ARGENTINA", "AUSTRALIA");
        startGameService.addGameToScoreBoard(scoreBoard, gameFifth);
        gameFifth.setHomeTeamScore(3);
        gameFifth.setAwayTeamScore(1);
        updateGameService.updateGameOnScoreBoard(scoreBoard, gameFifth);
        String result = summaryGameService.getSummaryFromScoreBoard(scoreBoard);
        Assert.assertTrue(result.endsWith("3-1\n"));
    }
}
