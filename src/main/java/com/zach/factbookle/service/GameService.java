package com.zach.factbookle.service;

import com.zach.factbookle.entity.Game;
import com.zach.factbookle.entity.Guess;
import com.zach.factbookle.repository.GameRepository;
import com.zach.factbookle.repository.GuessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository repo;

    @Autowired
    private GuessRepository guessRepo;

    public Game[] getGamesForMatch(int id) {
        return repo.findByMatchId(id);
    }

    public Game[] getGamesOfPlayer(int id) {
        return repo.findByPlayerId(id);
    }

    public Game getGamesOfMatchPlayer(int matchId, int playerId) {
        return repo.findByMatchIdAndPlayerId(matchId, playerId);
    }

    public double getAvgGuessesForMatch(int id){
        Game[] games = getGamesForMatch(id);
        return gameAvgGuessesHelper(games);
    }

    public double getAvgGuessesForPlayer(int id){
        Game[] games = getGamesOfPlayer(id);
        return gameAvgGuessesHelper(games);
    }

    public Game insertGame(Game game) {
        if(game.guesses != null) {
            for (Guess guess : game.guesses) {
                guessRepo.save(guess);
            }
        }
        return repo.save(game);
    }

    public double gameAvgGuessesHelper(Game[] games){
        if(games.length == 0) { return 0; }
        double avg = 0;
        for (Game game : games) {
            avg += game.numGuesses;
        }
        avg = avg / games.length;
        return avg;
    }
}
