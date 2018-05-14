package entities;

import java.util.List;
import java.util.ArrayList;

public class Project {
	
				private String name;
				private String description;
				private double goal;
				private double achievedFunds;
				private int fundingDuration;
				private String ownerLogin;
				private Category category;
				private List<Backer> backers;
				private List<Reward> rewards;
				
				public Project() {
								name = "";
								description = "";
								goal = -1;
								achievedFunds = 0;
								fundingDuration = 0;
								ownerLogin = "";
								category = Category.UNDIFINED;
								backers = new ArrayList<>();
								rewards = new ArrayList<>();
				}
				
				public Project(String name, String description, double goal, double achievedFunds,int fundingDuration, String ownerLogin,Category category) {
								this();
								this.name = name;
								this.description = description;
								this.goal = goal;
								this.achievedFunds = achievedFunds;
								this.fundingDuration = fundingDuration;
								this.ownerLogin = ownerLogin;
								this.category = category;
				}

				public String getName() {
								return name;
				}

				public void setName(String name) {
								this.name = name;
				}

				public String getDescription() {
							   return description;
				}

				public void setDescription(String description) {
								this.description = description;
				}

				public double getGoal() {
								return goal;
				}

				public void setGoal(double goal) {
								this.goal = goal;
				}

				public double getAchievedFunds() {
								return achievedFunds;
				}

				public void setAchievedFunds(double achievedFunds) {
								this.achievedFunds = achievedFunds;
				}

				public int getFundingDuration() {
								return fundingDuration;
				}

				public void setFundingDuration(int fundingDuration) {
								this.fundingDuration = fundingDuration;
				}

				public String getOwnerLogin() {
								return ownerLogin;
				}

				public void setOwnerLogin(String ownerLogin) {
								this.ownerLogin = ownerLogin;
				}

				public Category getCategory() {
								return category;
				}

				public void setCategory(Category category) {
								this.category = category;
				}

				public List<Backer> getBackers() {
								return backers;
				}

				public void setBackers(List<Backer> backers) {
								this.backers = backers;
				}

				public List<Reward> getRewards() {
								return rewards;
				}

				public void setRewards(List<Reward> rewards) {
								this.rewards = rewards;
				}

				@Override
				public String toString() {
								return "Project [name=" + name + ", description=" + description + ", goal=" + goal
								+ ", achievedFunds=" + achievedFunds + ", fundingDuration=" + fundingDuration
							    + ", ownerLogin=" + ownerLogin + ", category=" + category + ", backers=" + backers + "]";
				} 
}
