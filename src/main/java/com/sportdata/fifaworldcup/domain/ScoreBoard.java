package com.sportdata.fifaworldcup.domain;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class ScoreBoard {

    private Set<Game> games;

    public ScoreBoard() {
        games = new LinkedHashSet<>();
    }
}
