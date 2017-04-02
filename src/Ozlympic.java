import java.io.IOException;

/**
 * Created by Jodie Lu on 3/20/2017.
 */
public class Ozlympic {

    public static void main(String[] args) throws IOException {

        Driver driver = new Driver();
        //driver.mainMenu();
        readCSVdata.getCsvData();
        readCSVdata.display();

    }
}
