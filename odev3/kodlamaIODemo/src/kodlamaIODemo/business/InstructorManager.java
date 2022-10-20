package kodlamaIODemo.business;

import kodlamaIODemo.core.logging.ILogger;
import kodlamaIODemo.dataAccess.IInstructorDao;
import kodlamaIODemo.dataAccess.JdbcInstructorDao;
import kodlamaIODemo.entities.Instructor;

public class InstructorManager {
	
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	
	public InstructorManager(IInstructorDao instructorDao,ILogger[] loggers) {
		this.instructorDao=instructorDao;
		this.loggers=loggers;
	}
	
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for(ILogger logger:loggers) {
			logger.log(instructor.getName());
			
		}
	}
}
