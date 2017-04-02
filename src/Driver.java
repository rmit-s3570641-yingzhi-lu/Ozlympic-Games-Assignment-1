import java.util.Scanner;

/**
 * Created by Jodie Lu on 3/20/2017.
 */

public class Driver {

    private int choice;// the choice of the menu
    private String type; //the type of the game selected

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
                        type = selectGameLoop();
                        System.out.println(type);
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

    public void startGame() {
        System.out.println("Game Started..... ");

    }

    public void displayAllResults() {
        System.out.println("List below is all results:");
    }

    public void displayAllPoints() {
        System.out.println("Show all the athlete points:");
    }

    public void predictWinner() {

        System.out.println("List below is the name of athlete attend this game:");
        System.out.println("===================================================");

        do {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("Predict a winner please: ");
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Option 1");
                        return;
                    case 2:
                        System.out.println("Option 2");
                        return;
                    case 3:
                        System.out.println("Option 3");
                        return;
                    default:
                        System.out.println("INPUT AGAIN PLEASE! ");
                        break;
                }
            } catch (Exception e) {
                // if input is a string or others use try catch to let player
                // input again
                System.out.println("PLEASE INPUT RIGHT CHOICE NUMBER OF WINNER YOU PREDICTED!");
            }
        } while (true);

    }

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
