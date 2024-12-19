package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player addPlayer(Player player);
}
