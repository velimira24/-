package Rewards.Silver;

import Abstractions.IGamesItem;
import Abstractions.ItemsGenerator;

public class SilverGenerator extends ItemsGenerator {

    @Override
    public IGamesItem createItem() {
        return new SilverRewards();
    }

}