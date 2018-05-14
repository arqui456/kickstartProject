package entities;

public abstract class Reward {
	
				protected String description;
				protected double cost;
				
				public abstract void setDescription(String description);
				public abstract String getDescription();
				public abstract void setCost(double cost);
				public abstract double getCost();
}
