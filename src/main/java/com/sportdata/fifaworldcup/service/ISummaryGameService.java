package com.sportdata.fifaworldcup.service;

import com.sportdata.fifaworldcup.domain.ScoreBoard;

public interface ISummaryGameService {

    /**
     * @param scoreBoard
     * @return
     */
    String getSummaryFromScoreBoard(ScoreBoard scoreBoard);
}
