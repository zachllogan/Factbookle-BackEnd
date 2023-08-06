package com.zach.factbookle.controller;

import com.zach.factbookle.entity.Match;
import com.zach.factbookle.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/Match")
public class MatchController {
    @Autowired
    MatchService matchService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/{date}")
    Match getMatch(@PathVariable LocalDate date) {
        return matchService.getMatchByDate(date);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/all")
    Match[] getAllMatch() {
        return matchService.getAllMatches();
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    Match insertMatch(@RequestBody Match match) {
        return matchService.insertMatch(match);
    }
}
