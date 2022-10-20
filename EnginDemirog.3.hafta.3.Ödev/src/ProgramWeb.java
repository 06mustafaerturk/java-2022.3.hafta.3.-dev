import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dateAccess.DaoFaktory;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.*;

public class ProgramWeb {

	public static void main(String[] args) throws Exception {

		List<Instructor> instructors = new ArrayList<Instructor>();
		List<Course> courses = new ArrayList<Course>();
		List<Category> categories = new ArrayList<>();

System.out.println("********************************************************************");				

		CategoryManager categryMan = 
				new CategoryManager(DaoFaktory.getJDBCCategoryDao(), new EmailLogger(),categories);
		categryMan.add(new Category(1, "Program"));

System.out.println("********************************************************************");				

		InstructorManager insMan = 
				new InstructorManager(DaoFaktory.getJDBCInstructorDao(), new EmailLogger(), instructors);
		insMan.add(new Instructor(1, "Engin", "DEMÝROG"));

System.out.println("********************************************************************");				

		CourseManager cm =
				new CourseManager(DaoFaktory.getHibernateCourseDao(), new FileLogger(), courses);
		cm.add(new Course(1, "java", 15));
		cm.add(new Course(2, "php", 10));
		cm.add(new Course(1, "java", 15));
		
System.out.println("********************************************************************");				

		try {
			cm = new CourseManager(DaoFaktory.getHibernateCourseDao(), new FileLogger(), courses);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		
		
	}
}
