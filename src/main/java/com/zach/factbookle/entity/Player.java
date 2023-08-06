package com.zach.factbookle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Player {

    @Id
    @GeneratedValue
    public int playerId;

    public String name;
    @Column(length = 2048)
    public String pins;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "playerId")
//    public Game[] games;
}
