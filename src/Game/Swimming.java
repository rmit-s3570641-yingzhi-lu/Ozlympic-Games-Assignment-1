package Game;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Swimming implements Complete{

    @Override
    public double complete() {
        Random random = new Random();
        double score = (random.nextDouble() * 100.0d) + 100.0d;
        return score;

    }


}
