package dateAccess;

import java.security.PublicKey;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class DaoFaktory {

	public static IDao<Course> getHibernateCourseDao() {
		return new HibernateCourseDao();
	}

	public static IDao<Course> getJDBCCourseDao() {
		return new JDBCCourseDao();

	}
	
	
	public static IDao<Category> getHibernateCategoryDao() {
		return new HibernateCategoryDao();

	}
	
	public static IDao<Category> getJDBCCategoryDao() {
		return new JDBCCategoryDao();

	}
	
	public static IDao<Instructor> getJDBCInstructorDao() {
		return new JDBCInstructorDao();

	}
	
	
	
	public static IDao<Instructor> getHibernateInstructorDao() {
		return new HibernateInstructorDao();

	}
	
}
