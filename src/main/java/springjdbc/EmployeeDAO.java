package springjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component()
public class EmployeeDAO implements DAO<Employee> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(null,?,?)";
		return jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName());
	}

	@Override
	public void update(Employee employee) {
		String sql = "update employee set first_name = ?, last_name = ? where id=?";
		jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
	}

	@Override
	public void delete(Employee employee) {
		String sql = "delete from employee where id=?";
		jdbcTemplate.update(sql, employee.getId());
	}

	@Override
	public Employee select(int id) {
		String sql = "select * from employee where id = ?";
		Employee mapper = new Employee();
		return jdbcTemplate.queryForObject(sql,mapper,id);
	}

	@Override
	public List<Employee> selectAll() {
		String sql = "select * from employee";
		Employee mapper = new Employee();
		return jdbcTemplate.query(sql,mapper);
		
	}

}
