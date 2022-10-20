package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" Jdbc ile Eğitmen veritabanına eklendi");

		
	}

}
