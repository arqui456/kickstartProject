package initializer;

import java.util.Scanner;

import entities.Kickstarter;
import entities.User;

public class Session {

	             private Scanner scanner;
	             private User user;
			     
			     public  Session() {
			    	 
			     }
			     
			     public User UserExists(String login, String password) {
			    	 				for (User user : Kickstart.kick.getUsers()) 
			    	 							     if(user.getLogin().equals(login) && user.getPassword().equals(password)) 
			    	 							    	 			return user;
			    	 				return null;
			     }
			     
			     public boolean isDuplicatedLogin(String login) {
			    	 				for(User user: Kickstart.kick.getUsers())
			    	 								if(user.getLogin().equals(login))
			    	 												return true;
			    	 				return false;
			     }
			     
			     public void login(User user) {
			    	 				this.user = user;
			    	 				scanner = new Scanner(System.in);
			    	 				SessionMenu();
			     }
			     
			     public void SessionMenu() {
			    	 				boolean logged = true;
			    	 				while(logged) {
			    	 								System.out.println("User " + user.getName() + "Logged");
			    	 								System.out.println("Avaliable Commands: ");
			    	 								System.out.println("1. Create kickstart");
			    	 								System.out.println("2. See existing kickstart projects");
			    	 								System.out.println("3. Edit account");
			    	 								System.out.println("4. My projects");
			    	 								System.out.println("5. Collaborate with a kickstart");
			    	 								System.out.println("6. Account stats");
			    	 								System.out.println("7. Exit");
			    	 								
			    	 								int rawInput = -1;
			    	 								try {
			    	 												rawInput = Integer.parseInt(scanner.nextLine());
			    	 								} catch(Exception e) {
			    	 												rawInput = -1;
			    	 								}
			    	 								
			    	 								switch(rawInput) {
							    	 								case 1:
							    	 											break;
							    	 								case 2:
							    	 											break;
							    	 								case 3:
							    	 											break;
							    	 								case 4:
							    	 											break;
							    	 								case 5:
							    	 											break;
							    	 								case 6:
							    	 											break;
							    	 								case 7:
							    	 											logged = false;
							    	 								default:
							    	 											break;
			    	 								}
			    	 				}
			     }
			     
			     public void editAccount() {
			    	 			boolean editing = true;
			    	 			while(editing) {
			    	 							System.out.println("1. Change name");
			    	 							System.out.println("2. Change password");
			    	 							System.out.println("3. Change user details");
			    	 							System.out.println("4. Change user locale");
			    	 							System.out.println("5. Modify your credit card");
			    	 							System.out.println("6. Exit");
			    	 							
			    	 							int rawInput = -1;
		    	 								try {
		    	 												rawInput = Integer.parseInt(scanner.nextLine());
		    	 								} catch(Exception e) {
		    	 												rawInput = -1;
		    	 								}
			    	 							
			    	 							switch(rawInput) {
			    	 											case 1:
			    	 														System.out.println("Type in the new name: ");
			    	 														user.setName(scanner.nextLine());
			    	 														break;
			    	 											case 2:
			    	 														System.out.println("Type in the new password:  ");
			    	 														user.setPassword(scanner.nextLine());
			    	 														break;
			    	 											case 3:
			    	 														System.out.println("Type in user details: ");
			    	 														user.setUserDetails(scanner.nextLine());
			    	 														break;
			    	 											case 4:
			    	 														System.out.println("Type in your country of residence: ");
			    	 														user.setLocale(scanner.nextLine());
			    	 														break;
			    	 											case 5:
			    	 														break;
			    	 											case 6:
			    	 														editing = false;
			    	 														break;
			    	 											default:
			    	 														break;
			    	 							}
			    	 			}
			     }
			     
}
