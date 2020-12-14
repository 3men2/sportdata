package com.sportdata.fifaworldcup.domain;

import org.junit.Assert;
import org.junit.Test;

public class ScoreBoardTest {

    @Test
    public void createSocreBoard_ReturnOK() {
        ScoreBoard scoreBoard = new ScoreBoard();
        Assert.assertNotEquals(scoreBoard, null);
        Assert.assertTrue(scoreBoard.getGames().isEmpty());
    }
}
