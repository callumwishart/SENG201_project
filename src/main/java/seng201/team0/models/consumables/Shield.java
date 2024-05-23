package seng201.team0.models.consumables;

import seng201.team0.models.gameplay.Round;

public class Shield extends Consumable {
    public Shield() {
        super("Shield", "Makes you invincible for the next round.", 750);
    }

    public void apply(Round round) {
        round.setShield(true);
    }

    public boolean remove(Round round) {
        round.setShield(false);
        return true;
    }
}
