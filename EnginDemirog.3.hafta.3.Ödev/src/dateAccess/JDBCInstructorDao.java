package dateAccess;

import java.util.List;

import entities.Instructor;

public class JDBCInstructorDao implements IDao<Instructor>{

	@Override
	public void add(Instructor t, List<Instructor> l) {
			System.out.println(t.getInstructorName()+ "  adlý eðitmen JDBC ile veri tabanýna eklendi");
			l.add(t);
	}

}
