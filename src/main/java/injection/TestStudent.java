package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/injection/referenceconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getScores());
	}

}
