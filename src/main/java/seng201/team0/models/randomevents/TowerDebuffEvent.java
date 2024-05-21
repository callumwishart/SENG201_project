package seng201.team0.models.randomevents;

import seng201.team0.models.towers.Tower;
import seng201.team0.services.InventoryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TowerDebuffEvent extends RandomEvent{

    public TowerDebuffEvent() {
        super("Random Tower Debuff!", "A random tower in your inventory has been debuffed! Check out your Active towers to see what's happened!");
    }

    @Override
    public void apply(InventoryService inventoryService) {
        Random random = new Random();
        ArrayList<Tower> towers = inventoryService.getActiveTowers();
        int randomTowerIndex = random.nextInt(towers.size());
        Tower tower = towers.get(randomTowerIndex);
        tower.increaseReloadSpeed(1); // increases time to reload for the tower, making it a longer wait before it can be useful in a game
    }
}
