package entities;

public class CreditCard {
	
				private String owner;
				private String number;
				private String code;
				private String expireDate;
				
				public CreditCard() {
								this.owner = "";
								this.number = "";
								this.code = "";
								this.expireDate = "";
				}
				
				public CreditCard(String owner, String number, String code, String expireDate) {
								super();
								this.owner = owner;
								this.number = number;
								this.code = code;
								this.expireDate = expireDate;
				}

				public String getOwner() {
					return owner;
				}

				public void setOwner(String owner) {
					this.owner = owner;
				}

				public String getNumber() {
					return number;
				}

				public void setNumber(String number) {
					this.number = number;
				}

				public String getCode() {
					return code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getExpireDate() {
					return expireDate;
				}

				public void setExpireDate(String expireDate) {
					this.expireDate = expireDate;
				}

				@Override
				public String toString() {
					return "CreditCard [owner=" + owner + ", number=" + number + ", code=" + code + ", expireDate="
							+ expireDate + "]";
				}
}