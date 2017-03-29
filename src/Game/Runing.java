package Game;

import java.util.Random;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Runing implements Complete{

    @Override
    public double complete() {
        Random random = new Random();
        double score = (random.nextDouble() * 10.0d) + 10.0d;
        return score;
    }
}
