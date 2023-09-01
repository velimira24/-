package Rewards.Copper;

import Abstractions.IGamesItem;

public class CopperRewards implements IGamesItem {

    @Override
    public String open() {
        return "Copper :(";
    }
}