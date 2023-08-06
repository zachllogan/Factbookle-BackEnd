package com.zach.factbookle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Country {

    @Id
    @GeneratedValue
    private int cid;

    public String country;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderColumn(name = "sid")
    @JoinColumn(name = "cid")
    public Stat[] stats;
}
