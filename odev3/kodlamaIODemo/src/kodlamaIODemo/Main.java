package kodlamaIODemo;

import kodlamaIODemo.business.CategoryManager;
import kodlamaIODemo.business.CourseManager;
import kodlamaIODemo.business.InstructorManager;
import kodlamaIODemo.core.logging.DatabaseLogger;
import kodlamaIODemo.core.logging.EmailLogger;
import kodlamaIODemo.core.logging.FileLogger;
import kodlamaIODemo.core.logging.ILogger;
import kodlamaIODemo.dataAccess.HibernateInstructorDao;
import kodlamaIODemo.dataAccess.JdbcCategoryDao;
import kodlamaIODemo.dataAccess.JdbcCourseDao;
import kodlamaIODemo.entities.Category;
import kodlamaIODemo.entities.Course;
import kodlamaIODemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Category category1=new Category(1,"Kodlama");
		Category category2=new Category(2,"Tasarım");
		Category category3=new Category(3,"Web Tasarım");
		//Category category4=new Category(4,"Kodlama");


		
		CategoryManager categoryManager=new CategoryManager
				(new JdbcCategoryDao(),new ILogger[]
						{new DatabaseLogger(),new FileLogger(),new EmailLogger()});
					
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		//categoryManager.add(category4);


		
		
		Course course1=new Course(1,"Python",1000);
		Course course2=new Course(2,"Java",1000);
		Course course3=new Course(3,"C++",1000);
		//Course course4=new Course(4,"Java",1000);


		
		
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(),new ILogger[]
				{new DatabaseLogger(),new FileLogger(),new EmailLogger()});

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		//courseManager.add(course4);


		
		
		
		Instructor instructor1=new Instructor(1,"Engin DEMİROĞ");
		
		
		InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(),new ILogger[]
				{new DatabaseLogger(),new FileLogger(),new EmailLogger()});
		instructorManager.add(instructor1);
		
		
		

	}

}
