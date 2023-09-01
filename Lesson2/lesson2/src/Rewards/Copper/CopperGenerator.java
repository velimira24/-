package Rewards.Copper;

import Abstractions.IGamesItem;
import Abstractions.ItemsGenerator;

public class CopperGenerator extends ItemsGenerator {

    @Override
    public IGamesItem createItem() {
        return new CopperRewards();
    }
}