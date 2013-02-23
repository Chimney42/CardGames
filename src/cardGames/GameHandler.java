package cardGames;

import cardGames.blackJack.blackJackClassic.BlackJackClassic;
import cardGames.blackJack.blackJackClassic.BlackJackClassicGameState;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class GameHandler {

    private Game game;
    private GameState gameState;

    public GameHandler(Game game) {
        this.game = game;
        this.gameState = this.game.getInitialGameState();
    }

    public void init() {
        this.game.init(this.gameState);

        //Add Player
        addPlayer("foo");
    }

    public void doGame() {
        this.game.doGame(this.gameState);
    }

    private void addPlayerWithUserInput() {
        System.out.println("Enter Name");
        try {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();

            this.addPlayer(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addPlayer(String name) {
        Player player = new Player(name);

        this.gameState.addPlayer(name, player);
    }

    public GameState getGameState() {
        return this.gameState;
    }
}
