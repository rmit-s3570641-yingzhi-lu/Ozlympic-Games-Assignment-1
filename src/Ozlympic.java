import Participants.*;

import java.io.IOException;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Ozlympic {

    public static void main(String[] args) throws IOException {

        Driver driver = new Driver();
        driver.mainMenu();

        superAthlete.readSuperAthletedata();
        System.out.println();
        Cyclist.readCyclistdata();
        System.out.println();
        Sprinter.readSprinterdata();
        System.out.println();
        Swimmer.readSprinterdata();
        System.out.println();
        Official.readSprinterdata();
        System.out.println();

    }
}
