package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;

public interface IUpdateGameService {

    /**
     * @param scoreBoard
     * @param game
     * @return
     */
    boolean updateGameOnScoreBoard(ScoreBoard scoreBoard, Game game);
}
