package com.zach.factbookle.service;

import com.zach.factbookle.entity.Match;
import com.zach.factbookle.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MatchService {

    @Autowired
    private MatchRepository repo;

    public Match getMatch(int id) {
        return repo.findById(id).get();
    }

    public Match getMatchByCountry(String country) {
        return repo.findByCountry(country);
    }

    public Match getMatchByDate(LocalDate date) {
        return repo.findByDate(date);
    }

    public Match insertMatch(Match match) {
        return repo.save(match);
    }

    public Match[] getAllMatches() {
       return repo.findAll().toArray(new Match[0]);
    }
}
