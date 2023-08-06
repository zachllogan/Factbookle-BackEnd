package com.zach.factbookle.repository;

import com.zach.factbookle.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    public Player findByName(String name);
}
