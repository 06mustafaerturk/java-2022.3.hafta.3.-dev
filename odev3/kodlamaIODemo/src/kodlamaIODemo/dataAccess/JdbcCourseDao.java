package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Course;

public class JdbcCourseDao implements ICourseDao{

	public void add(Course course) {
		System.out.println(course.getName()+" Jdbc ile Kurs veritabanına eklendi");

	}
}
