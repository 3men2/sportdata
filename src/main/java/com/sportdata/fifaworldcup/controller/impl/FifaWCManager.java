package com.sportdata.fifaworldcup.controller.impl;

import com.sportdata.fifaworldcup.controller.IFifaWCManager;
import com.sportdata.fifaworldcup.domain.Game;
import com.sportdata.fifaworldcup.domain.ScoreBoard;
import com.sportdata.fifaworldcup.service.IFinishGameService;
import com.sportdata.fifaworldcup.service.IStartGameService;
import com.sportdata.fifaworldcup.service.ISummaryGameService;
import com.sportdata.fifaworldcup.service.IUpdateGameService;

public class FifaWCManager implements IFifaWCManager {

    private ScoreBoard scoreBoard;

    private IStartGameService startGameService;

    private IFinishGameService finishGameService;

    private IUpdateGameService updateGameService;

    private ISummaryGameService summaryGameService;

    public FifaWCManager(
            IStartGameService startGameService, IFinishGameService finishGameService,
            IUpdateGameService updateGameService, ISummaryGameService summaryGameService) {
        this.startGameService = startGameService;
        this.finishGameService = finishGameService;
        this.updateGameService = updateGameService;
        this.summaryGameService = summaryGameService;
    }

    public ScoreBoard getScoreBoardInstance() {
        if (scoreBoard == null)
            return new ScoreBoard();
        return scoreBoard;
    }

    @Override
    public boolean startGame(String homeTeam, String awayTeam) {
        Game game = new Game(homeTeam, awayTeam);
        return this.startGameService.addGameToScoreBoard(this.getScoreBoardInstance(), game);
    }

    @Override
    public boolean finishGame(String homeTeam, String awayTeam) {
        Game game = new Game(homeTeam, awayTeam);
        return this.finishGameService.removeGameFromScoreBoard(this.getScoreBoardInstance(), game);
    }

    @Override
    public boolean updateGame(String homeTeam, String awayTeam, String score) {
        Game game = new Game(homeTeam, awayTeam);
        game.setHomeTeamScore(Integer.valueOf(score.split("-")[0]));
        game.setAwayTeamScore(Integer.valueOf(score.split("-")[1]));
        return this.updateGameService.updateGameOnScoreBoard(this.getScoreBoardInstance(), game);
    }

    @Override
    public String summaryGames() {
        return this.summaryGameService.getSummaryFromScoreBoard(this.getScoreBoardInstance());
    }

}
