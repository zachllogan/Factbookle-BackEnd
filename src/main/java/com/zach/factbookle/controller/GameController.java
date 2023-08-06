package com.zach.factbookle.controller;

import com.zach.factbookle.entity.Game;
import com.zach.factbookle.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Game")
public class GameController {
    @Autowired
    GameService gameService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/{matchId}/any")
    Game[] getGamesOfMatch(@PathVariable int matchId) {
        return gameService.getGamesForMatch(matchId);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/any/{playerId}")
    Game[] getGamesOfPlayer(@PathVariable int playerId) {
        return gameService.getGamesOfPlayer(playerId);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/{matchId}/{playerId}")
    Game getGameForMatchPlayer(@PathVariable int matchId, @PathVariable int playerId) {
        return gameService.getGamesOfMatchPlayer(matchId, playerId);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/avg/{matchId}")
    double getAvgOfMatch(@PathVariable int matchId) {
        return gameService.getAvgGuessesForMatch(matchId);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/playerAvg/{playerId}")
    double getAvgOfPlayer(@PathVariable int playerId) {
        return gameService.getAvgGuessesForPlayer(playerId);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/count/{playerId}")
    int getGameCountOfPlayer(@PathVariable int playerId) {
        return gameService.getGamesOfPlayer(playerId).length;
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/stats/{matchId}/{playerId}")
    double[] getGameCountOfPlayer(@PathVariable int matchId, @PathVariable int playerId) {
        return new double[] {gameService.getAvgGuessesForMatch(matchId), gameService.getAvgGuessesForPlayer(playerId), gameService.getGamesOfPlayer(playerId).length};
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    Game insertGame(@RequestBody Game game) {
        return gameService.insertGame(game);
    }
}
