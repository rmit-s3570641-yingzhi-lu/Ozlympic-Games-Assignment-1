package Game;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public abstract class Games {

    public abstract void readDataFromAthlete() throws IOException;

    public static ArrayList<String[]> attendAthlete = new ArrayList<String[]>(); //attend athlete in every game
    public static final int COLUMN_NUM = 5;

    private int selectAttendAthleteNumber() {
        int num = (int) ((Math.random() * 4 + 5));
        return num;
    }

    public ArrayList<String[]> selectRandomNumberAthlete(ArrayList<String[]> ad) {

        for (int i = 0; i < selectAttendAthleteNumber(); i++) {
            String[] currCol = new String[COLUMN_NUM];
            for (int j = 0; j < COLUMN_NUM; j++) {
                int rowNum = (int) (Math.random() * ad.size());
                currCol[j] = ad.get(rowNum)[j];
                System.out.print(currCol[j]+" ");
            }
            attendAthlete.add(currCol);
            System.out.println();
        }
        return attendAthlete;
    }
}
