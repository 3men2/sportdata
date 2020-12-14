package com.sportdata.fifaworldcup.controller;

public interface IFifaWCManager {

    /**
     * @param homeTeam
     * @param awayTeam
     * @return
     */
    boolean startGame(String homeTeam, String awayTeam);

    /**
     * @param homeTeam
     * @param awayTeam
     * @return
     */
    boolean finishGame(String homeTeam, String awayTeam);

    /**
     * @param homeTeam
     * @param awayTeam
     * @param score
     * @return
     */
    boolean updateGame(String homeTeam, String awayTeam, String score);

    /**
     * @return
     */
    String summaryGames();
}
