package kodlamaIODemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIODemo.core.logging.ILogger;
import kodlamaIODemo.dataAccess.HibernateCategoryDao;
import kodlamaIODemo.dataAccess.ICategoryDao;
import kodlamaIODemo.dataAccess.JdbcCategoryDao;
import kodlamaIODemo.entities.Category;

public class CategoryManager {
	
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private List<String> listCategoryName=new ArrayList<String>();
	
	
	public CategoryManager(ICategoryDao categoryDao,ILogger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
	}
	
	
	public void add(Category category) throws Exception {	
		
		if(listCategoryName.size()==0) {
			listCategoryName.add(category.getName());
			
			categoryDao.add(category);
			
		}else {
			
			if(listCategoryName.contains(category.getName())) {
				
				throw new Exception("Aynı isimde ikitane kategori olamaz");
			}else {
				listCategoryName.add(category.getName());
				categoryDao.add(category);
			}
		}
		
		
		
		
		
		for (ILogger logger:loggers) {
			logger.log(category.getName());
		}
	}

}
