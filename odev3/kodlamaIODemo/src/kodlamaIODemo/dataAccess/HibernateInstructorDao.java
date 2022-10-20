package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" Hibernate ile Eğitmen veritabanına eklendi");

		
	}

}
