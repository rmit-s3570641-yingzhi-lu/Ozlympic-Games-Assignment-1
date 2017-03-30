import Game.Cycling;
import Menu.Menu;
import Participants.Cyclist;
import Participants.Participant;

import java.util.Scanner;

/**
 * Created by Jodie Lu on 3/20/2017.
 */

public class Driver {

    int choice;

    public void run() {

        printMenu();
    }

    public void printMenu() {

        Menu menu = new Menu();
        do {
            Scanner in = new Scanner(System.in);
            try {
                menu.menuShow();
                choice = in.nextInt();
                switch (choice) {

                    case 1:
                        System.out.println("Option 1");
                        break;
                    case 2:
                        System.out.println("Option 2");
                        break;
                    case 3:
                        System.out.println("Option 3");
                        break;
                    case 4:
                        System.out.println("Option 4");
                        break;
                    case 5:
                        System.out.println("Option 5");
                        break;
                    case 6:
                        System.out.println("End of Game Ozlympic ! Thanks for using!");
                        return;
                }
            } catch (Exception e) {
                // if input is a string or others use try catch to let player
                // input again
                System.out.println("PLEASE INPUT RIGHT CHOICE NUMBER!");
            }
        } while (true);
    }


    private void generateScore() {
        double score = new Cycling().complete();
        Cyclist par = (Cyclist) Participant.participantHashMap.get("123");
        par.setScore(score);
    }

}
