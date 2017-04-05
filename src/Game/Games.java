package Game;

import Participants.Official;

import java.io.IOException;
import java.util.ArrayList;

/*
 * Abstract Game Class
 *
 * This method is an abstract class which is extended by games
 *
 * Created by Yingzhi Lu on 3/20/2017.
 * Modified by both Ningqi Lu and Yingzhi Lu
 */

public abstract class Games {

    public abstract void readDataFromAthlete() throws IOException; // abstract method to read total
    // potential attending athletes

    public static ArrayList<String[]> attendAthlete = new ArrayList<String[]>(); //attend athlete in every game
    //stored current athlete attend games

    public static final int COLUMN_NUM = 5; // column number if csv file
    /**
     * select random number athlete
     * @param ad
     * @return ArrayList attendAthlete
     */
    public void selectRandomNumberAthlete(ArrayList<String[]> ad) {

        int num = (int) ((Math.random() * 4 + 4)); //the number of athletes will attend the game
        int[] rowNum = new int[num];

        for (int i = 0; i < num; i++) {
            rowNum[i] = (int) (Math.random() * (ad.size()-1)); //select a random row in ArrayList passed in
        }

        for (int i = 0; i < num; i++) {
            String[] currCol = new String[COLUMN_NUM];
            for (int j = 0; j < COLUMN_NUM; j++) {
                currCol[j] = ad.get(rowNum[i])[j];
                System.out.print(currCol[j] + " ");
            }
            attendAthlete.add(currCol);
            System.out.println();
        }
    }

    /**
     * read data from official
     * @throws IOException
     */
    public void readDataFromOfficial() throws IOException {

        ArrayList<String[]> attendOfficial = new ArrayList<>();
        attendOfficial.addAll(Official.getOfficial());
        selectRandomNumberAthlete(attendOfficial);

    }

    /**
     * getter and setter of ArrayList attendAthlete
     * @return attendAthlete
     */
    public static ArrayList<String[]> getAttendAthlete() {
        return attendAthlete;
    }

    public static void setAttendAthlete(ArrayList<String[]> attendAthlete) {
        Games.attendAthlete = attendAthlete;
    }
}

