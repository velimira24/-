package Rewards.Gold;

import Abstractions.IGamesItem;

public class GoldRewards implements IGamesItem {

    @Override
    public String open() {
        return "Gold";
    }
}