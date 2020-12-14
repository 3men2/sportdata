package com.sportdata.fifaworldcup.service.impl;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.IFinishGameService;

public class FinishGameService implements IFinishGameService {

    @Override
    public boolean removeGameFromScoreBoard(ScoreBoard scoreBoard, Game game) {
        return scoreBoard.getGames().remove(game);
    }
}
