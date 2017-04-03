package Participants;

import java.io.IOException;
import java.util.ArrayList;

import static Participants.readCSVdata.COLUMN_NUM;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Official {

    public Official() {
    }

    public static ArrayList<String[]> official = new ArrayList<String[]>();

    public static ArrayList<String[]> readOfficialdata() throws IOException {

        ArrayList<String[]> tempOf = readCSVdata.getCsvData();

        for (int i = 0; i < tempOf.size(); i++) {
            if (tempOf.get(i)[COLUMN_NUM - 1].equals("OFFICIAL")) {
                String[] currCol = new String[COLUMN_NUM];
                for (int n = 0; n < COLUMN_NUM; n++) {
                    currCol[n] = tempOf.get(i)[COLUMN_NUM + n - 5];
                    //System.out.print(currCol[n]);
                }
                official.add(currCol);
            }
        }
        return official;
    }

    public static ArrayList<String[]> getOfficial() {
        return official;
    }

    public static void setOfficial(ArrayList<String[]> official) {
        Official.official = official;
    }
}
