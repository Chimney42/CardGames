package cardGames.blackJack;

import cardGames.Player;
import junit.framework.*;
import org.junit.*;
import org.junit.Test;

/**
 * Author: lian
 * Date: 2/22/13
 */
public class BlackJackPlayerTest extends TestCase {

    @Test
    public void testChipcountShouldIncreaseByNumberOfGivenChips(){
        BlackJackPlayer player = new BlackJackPlayer();
        int givenChips = 5;

        player.addChips(givenChips);

        assertEquals(givenChips, player.getChipCount());
    }

}
