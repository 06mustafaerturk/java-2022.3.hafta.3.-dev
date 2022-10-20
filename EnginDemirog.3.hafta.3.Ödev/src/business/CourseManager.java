package business;


import java.util.List;

import dateAccess.IDao;
import entities.Course;
import logging.Logger;

public class CourseManager implements IBusiness<Course> {
	
	private IDao idao;
	private Logger logger;
	private List<Course> list;
	
	
	
	
	public CourseManager(IDao idao, Logger logger,List<Course> list) {
		super();
		this.idao = idao;
		this.logger = logger;
		this.list=list;
	}

	
	public void add(Course t) throws Exception {
		
		for(Course c : list) {
		if(c.getCourseName().equals(t.getCourseName())) {
			throw new Exception("Kurs ismi ayný olamaz");
		}else if(t.getCoursePrice()<0) {
			throw new Exception("Kursun fiyatý 0 dan küçük olamaz");
		}
		
		}
		idao.add(t,list);
		logger.log(t);
		
		
	}

	

}
