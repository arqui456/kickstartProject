package utils;

import java.util.ArrayList;
import java.util.List;

import entities.Category;
import entities.Project;
import initializer.Kickstart;

public class SearchProjects {
				
				public List<Project> listProjects(){
								return Kickstart.kick.getProjects();
				}
				
				public List<Project> listProjectByCategory(Category category){
								ArrayList<Project> projects = new ArrayList<>();
								for (Project project: Kickstart.kick.getProjects()) {
												if(project.getCategory().equals(category)) {
																projects.add(project);
												}
								}
								return projects;
				}

}
