package cardGames.blackJack;

import cardGames.Game;
import cardGames.GameState;

/**
 * Author: lian
 * Date: 2/22/13
 * All varieties of Black Jack have to implement this Interface
 * This interface only holds those methods, which are needed to play Black Jack
 */
public interface BlackJack extends Game {

    // On Startup, a full random deck is used and 2 cards are given to each player
    public void startRound(GameState gameState);

    // Each player has the possibility to add one additional card to his hand, when it's his turn
    public void addCard();

    // Each player can end his turn
    public void endTurn();

    //After all players have ended their turns, the winner will be determined
    public void checkHands();

    public BlackJackGameState getInitialGameState();
}
