package springjdbc.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springjdbc.DAO;

@Component
public class PassengerDAO implements DAO<Passenger>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger values(null,?,?)";
		return jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName());
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set first_name = ?, last_name = ? where id=?";
		return jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
	}

	@Override
	public int delete(Passenger passenger) {
		String sql = "delete from passenger where id=?";
		return jdbcTemplate.update(sql, passenger.getId());
	}

	@Override
	public Passenger select(int id) {
		String sql = "select * from passenger where id = ?";
		Passenger mapper = new Passenger();
		return (Passenger)jdbcTemplate.queryForObject(sql,mapper,id);
	}

	@Override
	public List<Passenger> selectAll() {
		String sql = "select * from passenger";
		Passenger mapper = new Passenger();
		return (List<Passenger>)jdbcTemplate.query(sql,mapper);
		
	}

}
