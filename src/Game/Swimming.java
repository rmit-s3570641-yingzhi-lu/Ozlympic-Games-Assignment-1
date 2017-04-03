package Game;

import Participants.Sprinter;
import Participants.Swimmer;
import Participants.superAthlete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Swimming extends Games implements Complete{

    @Override
    public String[] complete() {
        String[] score=new String[attendAthlete.size()];
        for (int count=0;count<attendAthlete.size();count++) {
            Random random = new Random();
            score[count] = String.format("%.2f",((random.nextDouble() * 100.0d) + 100.0d));
        }
        return score;
    }

    @Override
    public void readDataFromAthlete() throws IOException {

        ArrayList<String[]> attendSwimmingAthlete = new ArrayList<>();
        attendSwimmingAthlete.addAll(Swimmer.readSwimmerdata());
        attendSwimmingAthlete.addAll(Sprinter.readSprinterdata());
        attendSwimmingAthlete.addAll(superAthlete.readSuperAthletedata());
        super.selectRandomNumberAthlete(attendSwimmingAthlete);

    }

}
