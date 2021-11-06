package springjdbc.practice;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Passenger implements RowMapper<Passenger> {

	private int id;
	private String firstName;
	private String lastName;

	public Passenger() {}
	
	public Passenger(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Passenger(rs.getInt(1),rs.getString(2),rs.getString(3));
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
}
