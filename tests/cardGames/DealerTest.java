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
        Player[] players = this.setUpPlayers(2);
        List<Card> deck = this.dealer.getShuffledFrenchDeck();

        this.dealer.distributeAllCardsToPlayers(deck, players);

        assertEquals(deck.size() / players.length, players[0].getHand().size());
        assertEquals(deck.size() / players.length, players[1].getHand().size());
    }

    @Test
    public void testDealerShouldDistributeNumberOfCardsInADeckToPlayers() {
        int numberOfCardsPerPlayer = 2;
        Player[] players = this.setUpPlayers(2);
        List<Card> deck = this.dealer.getShuffledFrenchDeck();
        int originalDeckSize = deck.size();

        this.dealer.distributeNumberOfCardsToPlayers(deck, players, numberOfCardsPerPlayer);

        assertEquals(numberOfCardsPerPlayer, players[0].getHand().size());
        assertEquals(numberOfCardsPerPlayer, players[1].getHand().size());
        assertEquals(originalDeckSize - (numberOfCardsPerPlayer * players.length), deck.size());
    }

    private int countUniqueEntries(List<Card> frenchDeck) {
        return new HashSet<Card>(frenchDeck).size();
    }

    private Player[] setUpPlayers(int number) {
        Player[] players = new Player[number];

        for (int i = 0; i < number; i++) {
            players[i] = new Player();
        }
        return players;
    }
}
