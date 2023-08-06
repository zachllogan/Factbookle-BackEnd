package com.zach.factbookle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
@IdClass(GuessId.class)
public class Guess {

    public String country;

    @Id
    public int gameId;
    @Id
    public int guessOrder;
}
