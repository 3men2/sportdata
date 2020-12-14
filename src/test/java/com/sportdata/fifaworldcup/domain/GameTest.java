package com.sportdata.fifaworldcup.domain;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void createGameWithValues_ReturnOK() {
        Game game = new Game("URUGUAY", "BRAZIL");
        Assert.assertNotEquals(game, null);
        Assert.assertEquals(game.getAwayTeam(), "BRAZIL");
        Assert.assertEquals(game.getTotalScore(), 0);
    }
}
