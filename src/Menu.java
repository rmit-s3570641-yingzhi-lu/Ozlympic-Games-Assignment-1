import java.util.Scanner;

/**
 * @author Ningqi Lu
 *         22/03/2017
 */

public class Menu {

    public void menuShow() {
        String menu[] = {"\n Ozlympic Game",
                "===================================",
                "1. Select a game to run",
                "2. Predict the winner of the game",
                "3. Start the game",
                "4. Display the final results of all games",
                "5. Display the points of all athletes",
                "6. Exit",
                " Enter an option:"};
        for (int i = 0; i < menu.length; i++)
            System.out.println(menu[i]);
    }

    public void showGameSelect(){

        System.out.println("Please select one Ozlympic game to play:");
        System.out.println("1. Swimming");
        System.out.println("2. Cycling");
        System.out.println("3. Running");
    }


}
