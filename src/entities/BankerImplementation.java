package entities;

public class BankerImplementation extends Bank {
				
				public BankerImplementation() {
								 name = "";
								 ownerName = "";
								 balance = -1;
								 id = -1;
								 locale = "";
				}
				
				public BankerImplementation(String name, String ownerName, double balance, int id, String locale) {
								this.name = name;
								this.ownerName = ownerName;
								this.balance = balance;
								this.id = id;
								this.locale = locale;
				}

				@Override
				public String getName() {
								return name;
				}

				@Override
				public void setName(String name) {
								this.name = name;					
				}

				@Override
				public String getOwnerName() {
								return ownerName;
				}

				@Override
				public void setOwnerName(String ownerName) {
								this.ownerName = ownerName;
				}

				@Override
				public double getBalance() {
								return balance;
				}

				@Override
				public void setBalance(double balance) {
								this.balance = balance;
				}

				@Override
				public int getId() {
								return id;
				}

				@Override
				public void setId(int id) {
								this.id = id;
				}

				@Override
				public String getLocale() {
								return locale;
				}

				@Override
				public void setLocale(String locale) {
								this.locale = locale;
				}
}
