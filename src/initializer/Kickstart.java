package initializer;

import java.util.Scanner;

import entities.Kickstarter;
import entities.User;
import entities.UserImplementation;

public class Kickstart {

				private Scanner scanner;
				public static Kickstarter kick;
				private Session session;
				
				public  Kickstart() {
								 scanner = new Scanner(System.in);
								 kick = new Kickstarter();
								 session = new Session();
				}
				
				public void init() {
								boolean instancied = true;
								while(instancied) {
												System.out.println("1.Login");
												System.out.println("2.Register");
												System.out.println("3.Exit");
												System.out.println(": ");
												
												int choice = -1;
												String input = scanner.nextLine();
												try {
																				choice  = Integer.parseInt(input);
												} catch(Exception e) {
																choice = -1;
												}
												
												switch(choice) {
																case 1:
																				login();
																				break;
																case 2:
																				register();
																				break;
																case 3:
																				instancied = false;
																				break;
																default:
																				break;
												}
												
								}
								scanner.close();
				}
				
				private void login() {
								 System.out.println("Login: ");
								 String login = scanner.nextLine();
								 System.out.println("Type in your password: ");
								 String password = scanner.nextLine();
								 if(!login.equals("") && !password.equals("")) {
									 				User user = session.UserExists(login, password);
									 				if(user != null) {
									 								session.login(user);
									 				}
									 				else if(!session.isDuplicatedLogin(login)) {
									 								System.out.println("Login already in use!");
									 				}
									 				else {
									 								System.out.println("User don't exist");
									 				}
								 }
				}
				
				private void register() {
								System.out.println("Type in your login: ");
								String login = scanner.nextLine();
								if(!session.isDuplicatedLogin(login)) {
													System.out.println("Type in your name: ");
													String name = scanner.nextLine();
													System.out.println("Type in your password: ");
													String password = scanner.nextLine();
													User user = new UserImplementation(login, password, name);
													kick.addNewUser(user);
													System.out.println("User " + user + "added to the system!");
													session.login(user);
								} else {
												System.out.println("Login already in use!");
								}
					
				}
}
