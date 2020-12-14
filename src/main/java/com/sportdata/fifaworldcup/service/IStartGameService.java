package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;

public interface IStartGameService {

    /**
     * @param scoreBoard
     * @param game
     * @return
     */
    boolean addGameToScoreBoard(ScoreBoard scoreBoard, Game game);
}
