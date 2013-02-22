package cardGames.blackJack.blackJackClassic;

import cardGames.Player;
import junit.framework.*;
import org.junit.*;
import org.junit.Test;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class BlackJackClassicTest extends TestCase {

    private BlackJackClassic blackJackClassic;

    @Before
    public void setUp() {
        this.blackJackClassic = new BlackJackClassic();
    }

    @Test
    public void testItShouldAddAPlayerForTheBankOnStartUp() {
        BlackJackClassicGameState gameState = new BlackJackClassicGameState();
        this.blackJackClassic.init(gameState);

        assertTrue(gameState.getPlayer("Bank") instanceof Player);
    }


}
