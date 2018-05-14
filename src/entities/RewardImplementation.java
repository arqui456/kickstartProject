package entities;

public class RewardImplementation extends Reward {
	
				public RewardImplementation() {
								cost = 0;
								description = "";
				}
				
				public RewardImplementation(String description, double cost) {
							   this.description = description;
								this.cost =cost;
				}
				
				@Override
				public double getCost() {
					return cost;
				}

				@Override
				public void setCost(double cost) {
								this.cost = cost;
				}

				@Override
				public void setDescription(String description) {
								this.description = description;
				}

				@Override
				public String getDescription() {
								return description;
				}
	
}
