import java.util.*;

public class Menu {
	public Menu(){
		int option;
		Scanner in = new Scanner(System.in);
		do{
			String menu[] = {"\n Ozlympic Game",
					"\n ===================================",
					"\n 1. Select a game to run",
					"\n 2. Predict the winner of the game",
					"\n 3. Start the game",
					"\n 4. Display the final results of all games",
					"\n 5. Display the points of all athletes",
					"\n 6. Exit",
					"\n",
					" Enter an option:"};
			for (int i = 0; i< menu.length; i++)
				System.out.println(menu[i]);
			
			option = in.nextInt();
		} while (option < 1 || option > 6);
		
		switch(option){
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
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong option");
		} while (option != 6);
	}
}
