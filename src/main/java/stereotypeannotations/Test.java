package stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeannotations/config.xml");
		Instructor instructor = (Instructor) context.getBean("inst");
		System.out.println(instructor);
	}

}
