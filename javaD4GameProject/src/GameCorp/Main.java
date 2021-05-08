package GameCorp;

import java.util.Scanner;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		//User user1 = new User(1, "Engin", "Demiroð", 1985, "20000000000");
		User user2 = new User(2, "Erkan", "Akkoç", 1989, "30000000000");
		User user3 = new User();
		
		
		//ADDING NEW USER WITH INPUTS
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter First Name: ");  
		String firstName= sc.nextLine();              //reads string   
		System.out.print("You have entered: "+firstName + "\n");   
		user3.setFirstName(firstName);
		System.out.print("Enter Last Name: ");  
		String lastName= sc.nextLine();              
		System.out.print("You have entered: "+lastName + "\n");   
		user3.setLastName(lastName);
		System.out.print("Enter Birth Year: ");  
		String birthYear= sc.nextLine();                
		System.out.print("You have entered: "+birthYear + "\n");   
		user3.setBirthYear(Integer.parseInt(birthYear)); //Changing String to Int
		System.out.print("Enter Identity Id: ");  
		String identityId= sc.nextLine();                
		System.out.print("You have entered: "+identityId + "\n");   
		user3.setIdentityId(identityId);
		System.out.println();
		
		
		User[] users = {user2,user3};
		
		userManager.addMultiple(users);
		

		System.out.println();
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1, "NHL", 199.90);
		Game game2 = new Game(2, "Fifa 2020", 250);
		
		Game[] games = {game1,game2};
		gameManager.addMultiple(games);
		
		System.out.println();
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Summer Discount", 10));
		
		
		
		
	}

}
