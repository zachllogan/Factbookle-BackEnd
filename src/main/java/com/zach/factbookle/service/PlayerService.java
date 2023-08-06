package com.zach.factbookle.service;

import com.zach.factbookle.entity.Player;
import com.zach.factbookle.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repo;

    public Player getPlayer(int id) {
        return repo.findById(id).get();
    }

    public Player getPlayerByName(String name) {
        return repo.findByName(name);
    }

    public Player insertPlayer(Player player) {
        return repo.save(player);
    }

    public void savePins(int id, String pins) {
        Optional<Player> player = repo.findById(id);
        if(player.isPresent()) {
            Player playerObj = player.get();
            playerObj.pins = pins;
            repo.save(playerObj);
        }
    }
}
