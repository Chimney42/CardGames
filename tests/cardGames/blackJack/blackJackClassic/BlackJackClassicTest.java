package cardGames.blackJack.blackJackClassic;

import cardGames.GameHandler;
import cardGames.GameState;
import cardGames.Player;
import junit.framework.*;
import org.junit.*;
import org.junit.Test;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class BlackJackClassicTest extends TestCase {

    private GameHandler gameHandler;
    private BlackJackClassic blackJackClassic;
    private GameState gameState;

    @Before
    public void setUp() {
        this.blackJackClassic = new BlackJackClassic();
        this.gameHandler = new GameHandler(blackJackClassic);
        this.gameState = this.gameHandler.getGameState();
        this.blackJackClassic.init(this.gameState);
    }

    @Test
    public void testItShouldAddAPlayerForTheBankOnStartUp() {

        assertTrue(this.gameState.getPlayer("Bank") instanceof Player);
    }

    @Test
    public void testEachPlayerShouldReceiveTwoCardsOnStartUpOfEachRound() {
        this.gameHandler.init();
        this.blackJackClassic.startRound(this.gameState);
        assertEquals(2, this.gameState.getPlayer("Bank").getHand().size());
        assertEquals(2, this.gameState.getPlayer("foo").getHand().size());
    }

}
