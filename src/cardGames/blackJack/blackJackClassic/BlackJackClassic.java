package cardGames.blackJack.blackJackClassic;

import cardGames.GameState;
import cardGames.Player;
import cardGames.blackJack.BlackJack;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class BlackJackClassic implements BlackJack {

    //Initialize game
    public void init(GameState gameState) {
        //Set up Player for the bank
        Player bank = new Player();
        gameState.addPlayer("Bank", bank);
    }

    // On Startup, a full random deck is used and 2 cards are given to each player
    public void giveCards() {

    }

    // Each player has the possibility to add one additional card to his hand, when it's his turn
    public void addCard() {

    }

    // Each player can end his turn
    public void endTurn() {

    }

    //After all players have ended their turns, the winner will be determined
    public void checkHands() {

    }

    public BlackJackClassicGameState getInitialGameState() {
        return new BlackJackClassicGameState();
    }
}
