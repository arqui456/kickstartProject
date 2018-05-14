package initializer;

import java.util.Scanner;

import entities.Kickstarter;
import entities.User;

public class Session {

				 private Scanner scanner;
			     private User user;
			     private Kickstart kickstart = new Kickstart();
			     
			     
			     public  Session() {
			    	 
			     }
			     
			     public boolean UserExists(String login, String password) {
			    	 				for (User user : kickstart.  getUsers()) 
			    	 							     if(user.getLogin().equals(login) && user.getPassword().equals(password)) 
			    	 							    	 			return user;
			    	 				return null;
			     }
			     
			     public void SessionMenu() {
			    	 
			     }
			     
}
