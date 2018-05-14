package initializer;

import java.util.Scanner;

import entities.Kickstarter;

public class Kickstart {

				private Scanner scanner;
				private static Kickstarter kick;
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
								 if(login != null && password != null) {
									 //User user = new User();
								 }
				}
				
				private void register() {
					
				}
}
