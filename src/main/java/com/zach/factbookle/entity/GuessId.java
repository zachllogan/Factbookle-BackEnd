package com.zach.factbookle.entity;

import java.io.Serializable;

public class GuessId implements Serializable {
    private int gameId;
    private int guessOrder;

    public GuessId() {
    }

    public GuessId(int gameId, int guessOrder) {
        this.gameId = gameId;
        this.guessOrder = guessOrder;
    }

    @Override
    public boolean equals(Object obj) {
        return (gameId == ((GuessId)obj).gameId && guessOrder == ((GuessId)obj).guessOrder);
    }
}
