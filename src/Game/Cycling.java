package Game;

import Participants.Cyclist;
import Participants.Sprinter;
import Participants.superAthlete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Cycling extends Games implements Complete {
	/*
	 * (non-Javadoc)
	 * @see Game.Complete#complete()
	 */

    @Override
    public double complete() {
        Random random = new Random();
        double score = (random.nextDouble() * 300.0d) + 500.0d;
        return score;
    }
    
    /*
     * (non-Javadoc)
     * @see Game.Games#readDataFromAthlete()
     */

    @Override
    public void readDataFromAthlete() throws IOException {

        ArrayList<String[]> attendCyclingAthlete = new ArrayList<>();
        attendCyclingAthlete.addAll(Cyclist.readCyclistdata());
        attendCyclingAthlete.addAll(Sprinter.readSprinterdata());
        attendCyclingAthlete.addAll(superAthlete.readSuperAthletedata());

        super.selectRandomNumberAthlete(attendCyclingAthlete);
    }
    
    
}



