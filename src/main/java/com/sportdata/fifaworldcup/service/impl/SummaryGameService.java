package com.sportdata.fifaworldcup.service.impl;

import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.ISummaryGameService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryGameService implements ISummaryGameService {

    @Override
    public String getSummaryFromScoreBoard(ScoreBoard scoreBoard) {
        StringBuilder result = new StringBuilder();
        List<String> summaries = scoreBoard.getGames().stream()
                .sorted(Comparator.comparing(Game::getTotalScore))
                .map(game -> game.getHomeTeam() + "-" + game.getAwayTeam() + ":" + game.getHomeTeamScore() + "-" + game.getAwayTeamScore())
                .collect(Collectors.toList());
        Collections.reverse(summaries);
        for (String summary : summaries)
            result.append(summary).append("\n");
        return result.toString();
    }
}
