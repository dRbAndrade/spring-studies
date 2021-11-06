package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc/config.xml");
		DAO<Employee> dao = (EmployeeDAO) context.getBean("employeeDAO");
		System.out.println(dao.selectAll());
	}

}
