package com.zach.factbookle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue
    public int matchId;

    public String country;
    public LocalDate date;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "matchId")
//    public Game[] games;
}
