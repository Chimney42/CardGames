package cardGames; /**
 * Author: lian
 * Date: 2/22/13
 * This class is held by the cardGames.GameHandler
 * For Actions where Cards have to be randomized or given out, the cardGames.Dealer has to be passed to the method
 */

import java.util.*;

public class Dealer {

    public List<Card> getSortedFrenchDeck() {

        List<Card> sortedFrenchDeck = new ArrayList<Card>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                sortedFrenchDeck.add(new Card(suit, rank));
            }
        }

        return sortedFrenchDeck;
    }

    public List<Card> getShuffledFrenchDeck() {
        List<Card> sortedFrenchDeck = this.getSortedFrenchDeck();
        List<Card> shuffledFrenchDeck = new ArrayList<Card>();

        for (int i = 52; i > 0; i--) {
            int randomInt = new Random().nextInt(i);
            Card cardToShuffle = sortedFrenchDeck.get(randomInt);
            shuffledFrenchDeck.add(cardToShuffle);
            sortedFrenchDeck.remove(randomInt);
        }

        return shuffledFrenchDeck;
    }

    public void distributeAllCardsToPlayers(List<Card> deck, HashMap<String, Player> players) {

        if (0 == deck.size() % players.size()) {
            int originalDeckSize = deck.size();
            for (int i = 0; i < (originalDeckSize / players.size()); i++) {
                Iterator<Map.Entry<String, Player>> iterator = players.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Player> entry = (Map.Entry) iterator.next();
                    entry.getValue().addCardToHand(deck.get(0));
                    deck.remove(0);
                }
            }
        }
    }

    public void distributeNumberOfCardsToPlayers(List<Card> deck, HashMap<String, Player> players, int numberOfCardsPerPlayer) {
        if (numberOfCardsPerPlayer <= deck.size() / players.size()) {
           for (int i = 0; i < numberOfCardsPerPlayer; i++) {
               Iterator<Map.Entry<String, Player>> iterator = players.entrySet().iterator();
               while (iterator.hasNext()) {
                   Map.Entry<String, Player> entry = (Map.Entry) iterator.next();
                   entry.getValue().addCardToHand(deck.get(0));
                   deck.remove(0);
               }
           }
        }
    }

}
