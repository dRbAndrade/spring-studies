package springjdbc;

import java.util.List;

public interface DAO<T> {
	
	int create(T t);
	int update(T t);
	int delete(T t);
	T select(int id);
	List<T> selectAll();
}
