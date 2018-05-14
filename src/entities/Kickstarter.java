package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kickstarter {
	
				private Map<String, Project> projects;
				private Map<String, User> users;

				public Kickstarter() {
								projects = new HashMap<>();
								users = new HashMap<>();
				}
				
				public void addNewUser(User user) {
								users.put(user.getLogin(), user);
				}
				
				public void deleteUser(User user) {
								users.remove(user.getLogin());
				}
				
				public void editUser(User user) {
								users.remove(user.getLogin());
								users.put(user.getLogin(), user);
				}
				
				public List<User> getUsers(){
								return new ArrayList<User>(users.values());
				}
				
				public void addProject(Project project) {
								projects.put(project.getName(), project);
				}
				
				public void deleteProject(Project project) {
								projects.remove(project.getName());
				}
				
				public void editProject(Project project) {
								projects.remove(project).getName();
								projects.put(project.getName(), project);
				}
				
				public List<Project> getProjects(){
								return new ArrayList<Project>(projects.values());
				}
}
