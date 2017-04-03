package Participants;
import java.io.IOException;
import java.util.ArrayList;

import static Participants.readCSVdata.COLUMN_NUM;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Cyclist extends Athlete{

    public Cyclist(double score) {
        super(score);
    }

    public static ArrayList<String[]> cyclist = new ArrayList<String[]>();

    public static ArrayList<String[]> readCyclistdata() throws IOException {

        ArrayList<String[]> tempCy = readCSVdata.getCsvData();

        for (int i = 0; i < tempCy.size(); i++) {
            if (tempCy.get(i)[COLUMN_NUM - 1].equals("CYCLIST")) {
                String[] currCol = new String[COLUMN_NUM];
                for (int n = 0; n < COLUMN_NUM; n++) {
                    currCol[n] = tempCy.get(i)[COLUMN_NUM + n - 5];
                    //System.out.print(currCol[n]);
                }
                cyclist.add(currCol);
            }
        }
        return cyclist;


    }

    public static ArrayList<String[]> getCyclist() {
        return cyclist;
    }

    public static void setCyclist(ArrayList<String[]> cyclist) {
        Cyclist.cyclist = cyclist;
    }
}
