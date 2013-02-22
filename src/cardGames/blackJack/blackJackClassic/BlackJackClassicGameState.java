package cardGames.blackJack.blackJackClassic;

import cardGames.Player;
import cardGames.blackJack.BlackJackGameState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class BlackJackClassicGameState implements BlackJackGameState {

    private HashMap<String, Player> players;

    public BlackJackClassicGameState() {
        this.players = new HashMap<String, Player>();
    }

    public void addPlayer(String name, Player player) {
        this.players.put(name, player);
    }

    public Player getPlayer(String name) {
        return this.players.get(name);
    }
}
