package com.sportdata.fifaworldcup.domain;

import lombok.Data;

@Data
public class Game {

    private String homeTeam;
    private String awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private int totalScore;

    public Game(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
        this.updateTotalScore();
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
        this.updateTotalScore();
    }

    private void updateTotalScore() {
        this.totalScore = this.homeTeamScore + this.getAwayTeamScore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;

        Game game = (Game) o;

        if (!getHomeTeam().equals(game.getHomeTeam())) return false;
        return getAwayTeam().equals(game.getAwayTeam());
    }

    @Override
    public int hashCode() {
        int result = getHomeTeam().hashCode();
        result = 31 * result + getAwayTeam().hashCode();
        return result;
    }
}
