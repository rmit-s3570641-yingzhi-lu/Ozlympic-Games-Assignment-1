package Game;

import Participants.Sprinter;
import Participants.superAthlete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Runing extends Games implements Complete {

    @Override
    public double complete() {
        Random random = new Random();
        double score = (random.nextDouble() * 10.0d) + 10.0d;
        return score;
    }

    @Override
    public void readDataFromAthlete() throws IOException {

        ArrayList<String[]> attendRunningAthlete = new ArrayList<>();
        attendRunningAthlete.addAll(Sprinter.readSprinterdata());
        attendRunningAthlete.addAll(superAthlete.readSuperAthletedata());

        super.selectRandomNumberAthlete(attendRunningAthlete);

    }
}
