package com.zach.factbookle.repository;

import com.zach.factbookle.entity.Country;
import com.zach.factbookle.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    public Match findByCountry(String name);
    public Match findByDate(LocalDate date);
}
