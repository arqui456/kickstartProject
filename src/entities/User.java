package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class User implements Backer {
	
				protected String login;
				protected String  password;
				protected String name;
				protected String locale;
				protected String userDetails;
				protected CreditCard creditCard;
				protected Bank bank;
				protected List<Project> projects = new ArrayList<>();
				
				public abstract String getLogin() ;
				public abstract void setLogin(String login) ;
				public abstract String getPassword() ;
				public abstract void setPassword(String password) ;
				public abstract String getName() ;
				public abstract void setName(String name) ;
				public abstract String getLocale() ;
				public abstract void setLocale(String name) ;
				public abstract String getUserDetails() ;
				public abstract void setUserDetails(String name) ;
				public abstract CreditCard getCreditCard() ;
				public abstract void setCreditCard(CreditCard creditCard) ;
				public abstract Bank getBank() ;
				public abstract void setBank(Bank bank) ;
				public abstract List<Project> getAllProjects();
				public abstract void addProject(Project project);
				public abstract void removeProjectByTitle(String title);
}
