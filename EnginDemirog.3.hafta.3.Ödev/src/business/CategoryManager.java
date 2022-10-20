package business;

import java.util.List;

import dateAccess.IDao;
import entities.Category;
import entities.Course;
import logging.Logger;

public class CategoryManager implements IBusiness<Category> {

	private IDao idao;
	private Logger logger;
	private List<Category> liste;

	public CategoryManager(IDao idao, Logger logger, List<Category> liste) {
		super();
		this.idao = idao;
		this.logger = logger;
		this.liste = liste;
	}

	@Override
	public void add(Category t) throws Exception {
		for(Category cc:liste) {
		if(cc.getCategoryName().equals(t.getCategoryName())) {
			 throw new Exception("Kategory ismi ayný olamaz");
		 
		}
		}
		idao.add(t, liste);
		logger.log(t);
		
		
	}

}
