package dateAccess;

import java.util.List;

public interface IDao <T>{
	
	void add(T t,List<T> l);
	
}
