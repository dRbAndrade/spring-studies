package springjdbc.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("src/main/springjdbc/practice/resources/config.xml");
		PassengerDAO dao = (PassengerDAO) context.getBean("passengerDAO");
		//create
		Passenger passenger1 = new Passenger(1,"Matheus","Andrade");
		dao.create(passenger1);
		passenger1 = new Passenger(2,"dRb","Andrade");
		dao.create(passenger1);
		//read
		passenger1 = dao.select(1);
		Passenger passenger2 = dao.select(2);
		System.out.println(passenger1);
		System.out.println(passenger2);
		//update
		passenger1.setLastName("Chucre");
		dao.update(passenger1);
		passenger1 = dao.select(1);
		System.out.println(passenger1);
		//delete
		dao.delete(passenger1);
		passenger1 = dao.select(1);
		System.out.println(passenger1);
		
	}
	
}
