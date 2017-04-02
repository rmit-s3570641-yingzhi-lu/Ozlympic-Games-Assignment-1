package Participants;

import java.io.IOException;
import java.util.ArrayList;

import static Participants.readCSVdata.COLUMN_NUM;

/**
 * Created by Jodie Lu on 3/20/2017.
 */


public class superAthlete extends Athlete {

    public static ArrayList<String[]> superathletes = new ArrayList<String[]>();

    public superAthlete(String participantID, String participantName, String participantState, double score) {
        super(participantID, participantName, participantState, score);
    }

    public static ArrayList<String[]> readSuperAthletedata() throws IOException {

        ArrayList<String[]> tempSa = readCSVdata.getCsvData();

        for (int i = 0; i < tempSa.size(); i++) {
            if (tempSa.get(i)[COLUMN_NUM - 1].equals("SUPERATHLETE")) {
                String[] currCol = new String[COLUMN_NUM];
                for (int n = 0; n < COLUMN_NUM; n++) {
                    currCol[n] = tempSa.get(i)[COLUMN_NUM + n - 5];
                    System.out.print(currCol[n]);
                }
                superathletes.add(currCol);
            }
        }
        return superathletes;
    }

    public static ArrayList<String[]> getSuperathletes() {
        return superathletes;
    }

    public static void setSuperathletes(ArrayList<String[]> superathletes) {
        superAthlete.superathletes = superathletes;
    }
}
