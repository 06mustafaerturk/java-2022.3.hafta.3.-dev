package dateAccess;

import java.util.List;

import entities.Category;

public class JDBCCategoryDao implements IDao<Category>{

	@Override
	public void add(Category t, List<Category> l) {
			System.out.println(t.getCategoryName()+"  adlý kategory JDBC ile veri tabanýna eklendi");
			l.add(t);
	}

}
