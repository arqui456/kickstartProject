package entities;

public abstract class Bank {
	
				protected String name;
				protected String ownerName;
				protected double balance;
				protected int id;
				protected String locale;
				
				public abstract String getName() ;
				public abstract void setName(String name) ;
				public abstract String getOwnerName() ;
				public abstract void setOwnerName(String ownerName) ;
				public abstract double getBalance() ;
				public abstract void setBalance(double balance) ;
				public abstract int getId() ;
				public abstract void setId(int id) ;
				public abstract String getLocale() ;
				public abstract void setLocale(String locale) ;
}
