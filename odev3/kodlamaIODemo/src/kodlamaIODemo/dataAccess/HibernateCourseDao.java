package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Course;

public class HibernateCourseDao implements ICourseDao {
	
	public void add(Course course) {
		System.out.println(course.getName()+" Hibernate ile Kurs veritabanına eklendi");

	}

}
