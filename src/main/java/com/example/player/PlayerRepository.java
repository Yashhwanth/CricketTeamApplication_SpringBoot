package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player addPlayer(Player player);

    Player getPlayerById(int playerId);

    Player updatePlayerById(int playerId, Player player);
}
