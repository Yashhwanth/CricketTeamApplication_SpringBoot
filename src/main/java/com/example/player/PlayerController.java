package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.PlayerService;

@RestController
public class PlayerController {
    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerById(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayerById(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatePlayerById(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId) {
        playerService.deletePlayer(playerId);
    }
}
