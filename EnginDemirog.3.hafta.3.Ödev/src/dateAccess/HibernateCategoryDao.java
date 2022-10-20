package dateAccess;

import java.util.List;

import entities.Category;

public class HibernateCategoryDao implements IDao<Category> {

	@Override
	public void add(Category t, List<Category> l) {
			System.out.println("adlý kategory Hibernate ile veritabanaýna eklendi");
			l.add(t);
	}

}
