package dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/dependencycheck/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
	}

	
}
