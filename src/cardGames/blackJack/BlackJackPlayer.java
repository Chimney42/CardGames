package cardGames.blackJack;

import cardGames.Player;

/**
 * Author: lian
 * Date: 2/22/13
 * This is a Player implementation specific for BlackJack, since each Player has a certain number of chips
 */

public class BlackJackPlayer extends Player {

    private int chipCount;

    public BlackJackPlayer() {
        super();
        this.chipCount = 0;
    }
    public BlackJackPlayer(String name) {
        super(name);
        this.chipCount = 0;
    }

    public void addChips(int chips) {
        this.chipCount += chips;
    }

    public int getChipCount() {
        return this.chipCount;
    }
}
