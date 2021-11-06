package springjdbc;

import java.util.List;

public interface DAO<T> {
	
	int create(T t);
	void update(T t);
	void delete(T t);
	T select(int id);
	List<T> selectAll();
}
