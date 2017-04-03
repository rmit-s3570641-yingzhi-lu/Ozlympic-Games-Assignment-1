package Participants;

import java.io.IOException;
import java.util.ArrayList;

import static Participants.readCSVdata.COLUMN_NUM;

/**
 * Created by Jodie Lu on 3/20/2017.
 */

public class Sprinter extends Athlete{

    public Sprinter(double score) {
        super(score);
    }

    public static ArrayList<String[]> sprinter = new ArrayList<String[]>();

    public static ArrayList<String[]> readSprinterdata() throws IOException {

        ArrayList<String[]> tempSp = readCSVdata.getCsvData();

        for (int i = 0; i < tempSp.size(); i++) {
            if (tempSp.get(i)[COLUMN_NUM - 1].equals("SPRINTER")) {
                String[] currCol = new String[COLUMN_NUM];
                for (int n = 0; n < COLUMN_NUM; n++) {
                    currCol[n] = tempSp.get(i)[COLUMN_NUM + n - 5];
                    //System.out.print(currCol[n]);
                }
                sprinter.add(currCol);
            }
        }
        return sprinter;
    }

    public static ArrayList<String[]> getSprinter() {
        return sprinter;
    }

    public static void setSprinter(ArrayList<String[]> sprinter) {
        Sprinter.sprinter = sprinter;
    }
}
