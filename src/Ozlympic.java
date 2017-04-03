import Game.Cycling;
import Game.Runing;
import Game.Swimming;
import Participants.*;

import java.io.IOException;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Ozlympic {

    public static void main(String[] args) throws IOException {

        Driver driver = new Driver();
        //driver.mainMenu();

/*        superAthlete.readSuperAthletedata();
        System.out.println();
        Cyclist.readCyclistdata();
        System.out.println();
        Sprinter.readSprinterdata();
        System.out.println();
        Swimmer.readSwimmerdata();
        System.out.println();
        Official.readOfficialdata();
        System.out.println();*/

        System.out.println();
        Cycling c =new Cycling();
        c.readDataFromAthlete();
        System.out.println();

        Swimming s=new Swimming();
        s.readDataFromAthlete();
        System.out.println();

        Runing r=new Runing();
        r.readDataFromAthlete();
        System.out.println();
    }
}
