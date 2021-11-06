package springorm.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springjdbc.DAO;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springorm/practice/config.xml");
        DAO<Passenger> dao = (DAO<Passenger>) context.getBean("passengerDAO");
        Passenger passenger = new Passenger(1,"dRb","Chucre");
        dao.create(passenger);
        passenger.setFirstName("Matheus");
        passenger.setLastName("Monteiro");
        passenger.setId(4);
        dao.delete(passenger);
        passenger.setId(5);
        dao.update(passenger);
        dao.selectAll().forEach(System.out::println);

    }


}
