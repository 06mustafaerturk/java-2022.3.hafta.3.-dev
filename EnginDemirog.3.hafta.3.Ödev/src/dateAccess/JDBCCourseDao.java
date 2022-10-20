package dateAccess;

import java.util.List;

import entities.Course;

public class JDBCCourseDao implements IDao<Course>{

	@Override
	public void add(Course t,List<Course> list) {
			
			System.out.println(t.getCourseName()+ "  adlý kurs JDBC ile veri tabanýna yazýldý.");
			list.add(t);
	}

}
