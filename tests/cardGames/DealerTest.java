package cardGames; /**
 * Author: lian
 * Date: 2/22/13
 * This class tests and describes functionality of the cardGames.Dealer-Class
 */

import junit.framework.*;
import org.junit.*;
import org.junit.Test;
import java.util.*;


public class DealerTest extends TestCase{

    Dealer dealer;

    @Before
    public void setUp() {
        this.dealer = new Dealer();
    }


    @Test
    public void testStandardFrenchDeckShouldHave52Cards() {
        List<Card> deck = this.dealer.getSortedFrenchDeck();

        assertEquals(52, deck.size());
    }
    @Test
    public void testStandardFrenchDeckShouldHaveEachCardOnlyOnce() {
        List<Card> deck = this.dealer.getSortedFrenchDeck();

        assertEquals(deck.size(), countUniqueEntries(deck));
    }

    @Test
    public void testCardsShouldBeRandomizedAfterShuffling() {
        List<Card> shuffledDeck = this.dealer.getShuffledFrenchDeck();
        int randomInt = new Random().nextInt(51);

        List<Card> sortedFrenchDeck = this.dealer.getSortedFrenchDeck();

        assertEquals(52, shuffledDeck.size());
        assertEquals(shuffledDeck.size(), countUniqueEntries(shuffledDeck));
        assertFalse(shuffledDeck.get(randomInt).getRank() == sortedFrenchDeck.get(randomInt).getRank() && shuffledDeck.get(randomInt).getSuit() == sortedFrenchDeck.get(randomInt).getSuit());
    }

    @Test
    public void testDealerShouldDistributeAllCardsInADeckToPlayers() {
        HashMap<String, Player> players = this.setUpPlayers(2);
        List<Card> deck = this.dealer.getShuffledFrenchDeck();
        int originalDeckSize = deck.size();

        this.dealer.distributeAllCardsToPlayers(deck, players);

        assertEquals(originalDeckSize / players.size(), players.get("foo0").getHand().size());
        assertEquals(originalDeckSize / players.size(), players.get("foo1").getHand().size());
    }

    @Test
    public void testDealerShouldDistributeNumberOfCardsInADeckToPlayers() {
        int numberOfCardsPerPlayer = 2;
        HashMap<String, Player> players = this.setUpPlayers(2);
        List<Card> deck = this.dealer.getShuffledFrenchDeck();
        int originalDeckSize = deck.size();

        this.dealer.distributeNumberOfCardsToPlayers(deck, players, numberOfCardsPerPlayer);

        assertEquals(numberOfCardsPerPlayer, players.get("foo0").getHand().size());
        assertEquals(numberOfCardsPerPlayer, players.get("foo1").getHand().size());
        assertEquals(originalDeckSize - (numberOfCardsPerPlayer * players.size()), deck.size());
    }

    private int countUniqueEntries(List<Card> frenchDeck) {
        return new HashSet<Card>(frenchDeck).size();
    }

    private HashMap<String, Player> setUpPlayers(int number) {
        HashMap<String, Player> players = new HashMap<String, Player>();

        String name = "foo";
        for (int i = 0; i < number; i++) {
            players.put(name + i, new Player(name + i));
        }

        return players;
    }
}
