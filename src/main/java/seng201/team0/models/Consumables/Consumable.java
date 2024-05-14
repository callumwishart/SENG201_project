package seng201.team0.models.Consumables;

import seng201.team0.models.Item;

public abstract class Consumable extends Item {
    public Consumable(String inputName, String inputDescription, double inputCost) {
        super(inputName, inputDescription, inputCost);
    }
    public abstract void apply();
    public abstract void remove();

}
