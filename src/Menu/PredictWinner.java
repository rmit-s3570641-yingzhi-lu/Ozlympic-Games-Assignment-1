package Menu;

import java.util.Scanner;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class PredictWinner {

    public int predicWinner(int choice){

        System.out.println("Input the winner you select:");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        return choice;

    }

}
