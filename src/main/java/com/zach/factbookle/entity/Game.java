package com.zach.factbookle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Game {

    @Id
    @GeneratedValue
    public int gameId;

    public int numGuesses;
    public int matchId;
    public int playerId;

    @OneToMany
    @OrderColumn(name = "guessOrder")
    @JoinColumn(name = "gameId")
    public Guess[] guesses;
}
