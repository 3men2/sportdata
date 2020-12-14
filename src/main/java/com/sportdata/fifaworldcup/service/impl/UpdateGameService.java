package com.sportdata.fifaworldcup.service.impl;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.IUpdateGameService;

import java.util.Optional;

public class UpdateGameService implements IUpdateGameService {

    @Override
    public boolean updateGameOnScoreBoard(ScoreBoard scoreBoard, Game game) {
        Optional<Game> myGame = scoreBoard.getGames().stream()
                .filter(gameAux -> gameAux.equals(game))
                .findAny();
        if (myGame.isPresent()) {
            myGame.get().setHomeTeamScore(game.getHomeTeamScore());
            myGame.get().setAwayTeamScore(game.getAwayTeamScore());
            return true;
        }
        return false;
    }
}
