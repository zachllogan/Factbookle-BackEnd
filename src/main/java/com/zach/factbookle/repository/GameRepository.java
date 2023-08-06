package com.zach.factbookle.repository;

import com.zach.factbookle.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
    public Game[] findByMatchId(int idMatch);
    public Game[] findByPlayerId(int idPlayer);

    public Game findByMatchIdAndPlayerId(int idMatch, int idPlayer);
}
