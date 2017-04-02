package Participants;


import java.io.IOException;
import java.util.ArrayList;

import static Participants.readCSVdata.COLUMN_NUM;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Swimmer {

    public static ArrayList<String[]> swimmer = new ArrayList<String[]>();

    public static ArrayList<String[]> readSprinterdata() throws IOException {

        ArrayList<String[]> tempSw = readCSVdata.getCsvData();

        for (int i = 0; i < tempSw.size(); i++) {
            if (tempSw.get(i)[COLUMN_NUM - 1].equals("SWIMMER")) {
                String[] currCol = new String[COLUMN_NUM];
                for (int n = 0; n < COLUMN_NUM; n++) {
                    currCol[n] = tempSw.get(i)[COLUMN_NUM + n - 5];
                    System.out.print(currCol[n]);
                }
                swimmer.add(currCol);
            }
        }
        return swimmer;
    }

    public static ArrayList<String[]> getSwimmer() {
        return swimmer;
    }

    public static void setSwimmer(ArrayList<String[]> swimmer) {
        Swimmer.swimmer = swimmer;
    }
}
