package Game;

import java.util.Random;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Cycling implements Complete {

    @Override
    public double complete() {
        Random random = new Random();
        double score = (random.nextDouble() * 300.0d) + 500.0d;
        return score;
    }
}
