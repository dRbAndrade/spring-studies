package innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/innerbean/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
