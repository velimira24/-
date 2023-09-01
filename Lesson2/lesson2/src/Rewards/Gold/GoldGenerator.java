package Rewards.Gold;

import Abstractions.IGamesItem;
import Abstractions.ItemsGenerator;

public class GoldGenerator extends ItemsGenerator {
    @Override
    public IGamesItem createItem() {
        return new GoldRewards();
    }
}