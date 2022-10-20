package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	public void add(Category category) {
		System.out.println(category.getName()+" Jdbc ile Kategori veritabanına eklendi");
	}

}
