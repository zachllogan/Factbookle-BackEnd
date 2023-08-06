package com.zach.factbookle.controller;

import com.zach.factbookle.entity.Player;
import com.zach.factbookle.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Player")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/{name}")
    Player getPlayer(@PathVariable String name) {
        return playerService.getPlayerByName(name);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST)
    Player insertPlayer(@RequestBody Player player) {
        return playerService.insertPlayer(player);
    }
}
