package Core;

import java.util.*;
import Abstractions.ItemsGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;
import Rewards.Copper.CopperGenerator;

public class Core {

    public void run() {
        List<ItemsGenerator> generatorList = new ArrayList<>();

        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new CopperGenerator());

        ItemsGenerator myGenerator = generatorList.get(new Random().nextInt(generatorList.size()));
        System.out.println(myGenerator.openReward());
    }

    // Логика игры выше
}