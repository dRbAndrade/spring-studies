package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital name: " + hospital.getName());
		System.out.println("Hospital Departments: ");
		hospital.getDepartments().forEach(e->System.out.printf("%5s%s%n","",e));
	}

}
