package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
	
	public void add(Category category) {
		System.out.println(category.getName()+" Hibernate ile Kategori veritabanına eklendi");
	}

}
