package cardGames;

/**
 * Author: lian
 * Date: 2/22/13
 * All Games have to implement this interface
 */
public interface Game {

    //Initialize game
    public void init(GameState gameState);

    //dynamically create corresponding GameState
    public GameState getInitialGameState();
}
