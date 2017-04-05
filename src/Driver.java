import Game.Cycling;
import Game.Games;
import Game.Running;
import Game.Swimming;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Jodie Lu on 3/20/2017.
 */

public class Driver {

    private int choice;// the choice of the menu
    private String type; //the type of the game selected
    private int athleteChoice = 0;//the choice of athlete
    public static HashMap<String, String> scoreMap = new HashMap<String, String>();//hashmap used to store the score and athlete data

    /**
     * Created by Ningqi Lu
     * Match user's choice from Menu
     */
    public void mainMenu() {

        Menu menu = new Menu();
        do {
            Scanner in = new Scanner(System.in);
            try {
                menu.menuShow();
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        menu.showGameSelect();
                        showAthleteinSelectedGame();
                        break;
                    case 2:
                        predictWinner();
                        break;
                    case 3:
                        startGame();
                        break;
                    case 4:
                        displayAllResults();
                        break;
                    case 5:
                        displayAllPoints();
                        break;
                    case 6:
                        System.out.println("End of Game Ozlympic ! Thanks for playing!");
                        return;
                }
            } catch (Exception e) {
                // if input is a string or others use try catch to let player
                // input again
                System.out.println("PLEASE INPUT RIGHT CHOICE NUMBER !");
            }
        } while (true);
    }


    /**
     * Created by Jodie Lu
     */
    public void storeHistoryData(Object o, String[] strings) {


    }

    public HashMap getAthleteScore() {

        String[] score = new String[Games.attendAthlete.size()];
        switch (type) {
            case "swimming":
                Swimming s = new Swimming();
                score = s.complete();
                break;
            case "cycling":
                Cycling c = new Cycling();
                score = c.complete();
                break;
            case "running":
                Running r = new Running();
                score = r.complete();
                break;
        }

        for(int i=0;i<Games.attendAthlete.size();i++){
            scoreMap.put(Games.attendAthlete.get(i)[1],score[i]);
        }
        return scoreMap;
    }

    /**
     * Created by Jodie Lu
     *
     */
    public void startGame() {

        System.out.println("Game Started..... ");
        System.out.println("Here is the score of each athlete:");
        getAthleteScore().clear();
        getAthleteScore();
        Set entries = scoreMap.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Name: "+key+"     Score: "+value);
        }
    }

    public void displayAllResults() {
        System.out.println("List below is all results:");
    }

    public void displayAllPoints() {
        System.out.println("Show all the athlete points:");
    }

    /**
     * Created by Ningqi Lu
     * Show the athlete attending each game
     */
    public void showAthleteinSelectedGame() throws IOException {
        type = selectGameLoop();
        System.out.println("List below is the name of athlete attend " + type + ":");
        System.out.println("===================================================");
        switch (type) {
            case "swimming":
                Games.getAttendAthlete().clear();
                Swimming s = new Swimming();
                s.readDataFromAthlete();
                break;
            case "cycling":
                Games.getAttendAthlete().clear();
                Cycling c = new Cycling();
                c.readDataFromAthlete();
                break;
            case "running":
                Games.getAttendAthlete().clear();
                Running r = new Running();
                r.readDataFromAthlete();
                break;
        }
    }


    /**
     * Created by Jodie Lu
     * Predict winner of ecah game for user
     */
    public void predictWinner() {
        System.out.println("Input the order number of Athlete to predict the winner:");
        //System.out.println(Games.attendAthlete.size());

        do {
            Scanner in = new Scanner(System.in);
            boolean b = false;
            try {
                athleteChoice = in.nextInt();
                if (athleteChoice > Games.getAttendAthlete().size()) {
                    //when input order number larger than size of arraylist
                    System.out.println("Please input a reasonable choice!");
                } else {
                    System.out.println("The Athlete you predicted is:");
                    for (int n = 0; n < Ozlympic.COLUMN_NUM; n++) {
                        System.out.print(Games.getAttendAthlete().get(athleteChoice - 1)[n] + " ");
                        //
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please input an order number of athlete list above!");
                b = true;
            }
        } while (true);
        System.out.println();
    }

    /**
     * Created by Jodie Lu
     */

    public String selectGameLoop() {
        do {
            Scanner in = new Scanner(System.in);
            try {
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You selected Swimming and it will be started soon.");
                        System.out.println("Remember to predict a winner !");
                        type = "swimming";
                        return type;
                    case 2:
                        System.out.println("You selected Cycling and it will be started soon.");
                        System.out.println("Remember to predict a winner !");
                        type = "cycling";
                        return type;
                    case 3:
                        System.out.println("You selected Running and it will be started soon.");
                        System.out.println("Remember to predict a winner !");
                        type = "running";
                        return type;
                    default:
                        System.out.println("NO GAME OF THIS NUMBER! CHOOSE AGAIN!");
                }
            } catch (Exception e) {
                // if input is a string or others use try catch to let player
                // input again
                System.out.println("PLEASE INPUT RIGHT CHOICE NUMBER OF GAME SELECTION!");
            }
        } while (true);
    }

}
