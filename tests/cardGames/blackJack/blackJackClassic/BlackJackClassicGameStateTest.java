package cardGames.blackJack.blackJackClassic;

import cardGames.Player;
import junit.framework.*;
import org.junit.*;
import org.junit.Test;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class BlackJackClassicGameStateTest extends TestCase {

    private BlackJackClassicGameState gameState;

    @Before
    public void setUp() {
        this.gameState = new BlackJackClassicGameState();
    }

    @Test
    public void testItShouldAddAPlayer() {
        String name = "foo";
        Player foo = new Player(name);

        this.gameState.addPlayer(name, foo);

        assertEquals(this.gameState.getPlayer(name), foo);
    }
}
