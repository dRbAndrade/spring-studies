package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("src/config.xml");
		Employee employee = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
	}

}
