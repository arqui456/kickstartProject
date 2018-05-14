package entities;

public class UserImplementation extends User {

				public UserImplementation() {
								 login = "";
								 password = "";
								 name = "";
								 locale = "";
								 userDetails = "";
								 creditCard = new CreditCard();
								 bank = new BankerImplementation();								
				}
				
				public UserImplementation(String login, String password, String name) {
								this.login = login;
								this.password = password;
								this.name = name;								
				}
				
				public UserImplementation(String login, String password, String name, String locale, String userDetails, CreditCard creditCard, Bank bank) {
								this(login, password,name);
								this.locale = locale;
								this.userDetails = userDetails;
								this.creditCard = creditCard;
								this.bank = bank;								
				}
				
				
				@Override
				public String getLogin() {
					return login;
				}

				@Override
				public void setLogin(String login) {
					this.login = login;
				}

				@Override
				public String getPassword() {
					return password;
				}

				@Override
				public void setPassword(String password) {
					this.password = password;
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
				public String getLocale() {
					return locale;
				}

				@Override
				public void setLocale(String locale) {
					this.locale = locale;
				}
				
				@Override
				public String getUserDetails() {
					return userDetails;
				}

				@Override
				public void setUserDetails(String userDetails) {
					this.userDetails = userDetails;
				}
				
				@Override
				public  CreditCard getCreditCard() {
								return creditCard;
				}
				
				@Override
				public void setCreditCard(CreditCard creditCard) {
								this.creditCard = creditCard;
				}
				
				@Override
				public Bank getBank() {
					return bank;
				}

				@Override
				public void setBank(Bank bank) {
					this.bank = bank;
				}
				
				@Override
				public String getBackerName() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public double getDonation() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public String toString() {
					return "UserImplemented [name=" + name + ", login=" + login + ", password=" + password + ", bank="
							+ bank + ", userDetails=" + userDetails + ", locale=" + locale + "]";
				}

}	
