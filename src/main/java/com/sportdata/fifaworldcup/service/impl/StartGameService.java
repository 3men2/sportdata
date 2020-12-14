package com.sportdata.fifaworldcup.service.impl;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.IStartGameService;

public class StartGameService implements IStartGameService {

    @Override
    public boolean addGameToScoreBoard(ScoreBoard scoreBoard, Game game) {
        return scoreBoard.getGames().add(game);
    }
}
