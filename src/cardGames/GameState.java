package cardGames;

/**
 * Author: lian
 * Date: 2/22/13
 * All GameStates must extend this Interface
 */
public interface GameState {

    public void addPlayer(String name, Player player);

    public Player getPlayer(String name);
}
