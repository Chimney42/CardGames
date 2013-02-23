package cardGames.blackJack.blackJackClassic;

import cardGames.Dealer;
import cardGames.GameState;
import cardGames.Player;
import cardGames.blackJack.BlackJack;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class BlackJackClassic implements BlackJack {

    private Dealer dealer;

    //Initialize game
    public void init(GameState gameState) {
        //Set up Player for the bank
        Player bank = new Player("Bank");
        gameState.addPlayer("Bank", bank);
        this.dealer = new Dealer();
    }

    //Do One Round
    public void doGame(GameState gameState) {
        startRound(gameState);
    }

    public void startRound(GameState gameState) {
        //On Startup, a full random deck is used and 2 cards are given to each player
        dealer.distributeNumberOfCardsToPlayers(dealer.getShuffledFrenchDeck(), gameState.getPlayers(), 2);
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
