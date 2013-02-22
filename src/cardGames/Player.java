package cardGames;

/**
 * Author: lian
 * Date: 2/22/13
 */

import java.util.*;

public class Player {

    private List<Card> hand;
    private String name;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public List<Card> getHand() {
        return this.hand;
    }

    public String getName() {
        return this.name;
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }
}
