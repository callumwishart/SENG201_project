package seng201.team0.models.towers;

import seng201.team0.models.resources.Goods;
import seng201.team0.models.resources.Resource;

/**
 * Factor Tower type which generates Goods
 */
public class Factory extends Tower{
    private static final Resource Goods = new Goods();
    public static String towerImagePath = "src/main/resources/images/towers/factory_tower.png";
    public static String brokenImagePath = "src/main/resources/images/towers/factory_tower_broken.png";

    /**
     * Factory Constructor when no params passed
     * <p>
     *    Initialises the inputReloadSpeed to 5 and the cost to 500.
     * </p>
     */
    public Factory() {
        super(Goods, 5, "Factory", "Resource: " + Goods.getResourceType(), 500, towerImagePath, brokenImagePath);
    }
}
