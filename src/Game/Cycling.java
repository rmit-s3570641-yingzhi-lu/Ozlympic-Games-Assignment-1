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

    @Override
    public String[] complete() {
        String[] score=new String[attendAthlete.size()];
        for (int count=0;count<attendAthlete.size();count++) {
            Random random = new Random();
            score[count] = String.format("%.2f",((random.nextDouble() * 300.0d) + 500.0d));
        }
        return score;
    }
    @Override
    public void readDataFromAthlete() throws IOException {

        ArrayList<String[]> attendCyclingAthlete = new ArrayList<>();
        attendCyclingAthlete.addAll(Cyclist.readCyclistdata());
        attendCyclingAthlete.addAll(Sprinter.readSprinterdata());
        attendCyclingAthlete.addAll(superAthlete.readSuperAthletedata());
        super.selectRandomNumberAthlete(attendCyclingAthlete);
    }

}



