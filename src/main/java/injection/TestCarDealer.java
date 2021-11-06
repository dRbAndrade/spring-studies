package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarDealer {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/setconfig.xml");
		CarDealer dealer= (CarDealer) context.getBean("carDealer");
		System.out.println("CarDealer name: " + dealer.getName());
		System.out.println("CarDealer Departments: ");
		dealer.getModels().forEach(e->System.out.printf("%5s%s%n","",e));
	}

}
