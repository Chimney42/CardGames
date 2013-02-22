package cardGames;

import cardGames.blackJack.BlackJack;
import cardGames.blackJack.blackJackClassic.BlackJackClassic;
import junit.framework.TestCase;
import junit.framework.*;
import org.junit.*;
import org.junit.Test;
import java.util.*;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class GameHandlerTest extends TestCase {

    private GameHandler gameHandler;

    @Before
    public void setUp() {
        this.gameHandler = new GameHandler(new BlackJackClassic());
    }

    @Test
    public void testItShouldAddPlayersWithGivenNames() {
        String name = "foo";

        this.gameHandler.addPlayer(name);

        assertNotNull(this.gameHandler.getGameState().getPlayer(name));
    }
}
