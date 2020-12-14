package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;

public interface IFinishGameService {

    /**
     * @param scoreBoard
     * @param game
     * @return
     */
    boolean removeGameFromScoreBoard(ScoreBoard scoreBoard, Game game);
}
