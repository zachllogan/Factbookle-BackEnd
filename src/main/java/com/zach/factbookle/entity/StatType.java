package com.zach.factbookle.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class StatType {
    @Id
    @GeneratedValue
    private int sid;

    public String name;
    @Column(length = 1024)
    public String description;
    public String category;
    public String unit;
}
