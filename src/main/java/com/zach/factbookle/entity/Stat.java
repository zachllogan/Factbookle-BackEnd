package com.zach.factbookle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Stat {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sid", nullable = false)
    public StatType statType;

    public String value;
    public int ranking;
    public String dateOfInformation;
}
