package business;

import java.util.List;

import dateAccess.IDao;
import entities.Instructor;
import logging.Logger;

public class InstructorManager implements IBusiness<Instructor> {

	private IDao idao;
	private Logger logger;
	private List<Instructor> liste;
	
	
	
	public InstructorManager(IDao idao, Logger logger, List<Instructor> liste) {
		super();
		this.idao = idao;
		this.logger = logger;
		this.liste = liste;
	}



	@Override
	public void add(Instructor a) { 
		for(Instructor i:liste) { 
		if(i.getInstructorName().equals(a.getInstructorName())){
			System.out.println("Ayný isimde egitmen olamaz");
		}
		}
		idao.add(a, liste);
		logger.log(a);
	}

	
		
		
		
		
}
