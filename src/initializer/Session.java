package initializer;

import java.util.Scanner;

import entities.Category;
import entities.Kickstarter;
import entities.Project;
import entities.User;
import utils.SearchProjects;

public class Session {

	             private Scanner scanner;
	             private User user;
	             private SearchProjects projetsList;
			     
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
			    	 				projetsList = new SearchProjects();
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
							    	 											newProject();
							    	 											break;
							    	 								case 2:
							    	 											existingKickstartProjects();
							    	 											break;
							    	 								case 3:
							    	 									editAccount();
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
			     
			     private void existingKickstartProjects() {
			    	 				if(projetsList.listProjects().size() > 0){
			    	 								System.out.println("To see more info about a project, select it by its id ");
			    	 								int id = 0;
			    	 								System.out.println("Projects ------------------------id");
			    	 								for (Project project : projetsList.listProjects()) {
			    	 													System.out.println(project + "  " + id++);
			    	 								}
			    	 								int input = -1;
			    			    	 				try {
			    			    	 					input = Integer.parseInt(scanner.nextLine());
			    			    	 				} catch(Exception e) {
			    			    	 					input = -1;
			    			    	 				}
			    	 				} else {
			    	 								System.out.println("List is empty.");
			    	 				}
			     }
			     
			     private void newProject() {
			    	 			boolean isAddingProject = true;
						 		while(isAddingProject) {
									 			System.out.print("Type project name: ");
									 			String name = scanner.nextLine();
									 			System.out.print("Add a description: ");
									 			String description = scanner.nextLine();
									 			System.out.print("Type desired money: ");
									 			double desiredMoney = Double.parseDouble(scanner.nextLine());
									 			System.out.print("Type duration: ");
									 			int duration = Integer.parseInt(scanner.nextLine());
									 			Project project = new Project(name, duration, desiredMoney, description);
									 			System.out.println("Type the category: ");
									 			System.out.println("1. ART");
									 			System.out.println("2. COMMICS");
									 			System.out.println("3. CRAFTS");
									 			System.out.println("4. DANCE");
									 			System.out.println("5. DESIGN");
									 			System.out.println("6. FASHION");
									 			System.out.println("7. FILM_AND_VIDEO");
									 			System.out.println("8. FOOD");
									 			System.out.println("9. GAMES");
									 			System.out.println("10. JOURNALISM");
									 			System.out.println("11. MUSIC");
									 			System.out.println("12. PHOTOGRAPHY");
									 			System.out.println("13. PUBLISHING");
									 			System.out.println("14. TECHNOLOGY");
									 			System.out.println("15. THEATER");
									 			System.out.println("16. UNDEFINED");
									 			System.out.print(">>>");
						 			
									 			int option = -1;
									 			try {
									 				option = Integer.parseInt(scanner.nextLine());
									 			} catch(Exception e) {
									 				System.out.println("PROCLEM");
									 				option = -1;
									 			}
									 			
									 			switch(option) {
									 				case 1:
									 					project.setCategory(Category.ART);
									 					break;
									 				case 2:
									 					project.setCategory(Category.COMMICS);
									 					break;
									 				case 3:
									 					project.setCategory(Category.CRAFTS);
									 					break;
									 				case 4:
									 					project.setCategory(Category.DANCE);
									 					break;
									 				case 5:
									 					project.setCategory(Category.DESIGN);
									 					break;
									 				case 6:
									 					project.setCategory(Category.FASHION);
									 					break;
									 				case 7:
									 					project.setCategory(Category.FILM_AND_VIDEO);
									 					break;
									 				case 8:
									 					project.setCategory(Category.FOOD);
									 					break;
									 				case 9:
									 					project.setCategory(Category.GAMES);
									 					break;
									 				case 10:
									 					project.setCategory(Category.JOURNALISM);
									 					break;
									 				case 11:
									 					project.setCategory(Category.MUSIC);
									 					break;
									 				case 12:
									 					project.setCategory(Category.PHOTOGRAPHY);
									 					break;
									 				case 13:
									 					project.setCategory(Category.PUBLISHING);
									 					break;
									 				case 14:
									 					project.setCategory(Category.TECHNOLOGY);
									 					break;
									 				case 15:
									 					project.setCategory(Category.THEATER);
									 					break;
									 				default:
									 					project.setCategory(Category.UNDEFINED);
									 					break;
									 			}
			 			
			 			project.setOwnerLogin(user.getLogin());
			 			user.addProject(project);
			 			Kickstart.kick.addProject(project);
			 			isAddingProject = false;
			 		}
			    	 			
			     }
}
