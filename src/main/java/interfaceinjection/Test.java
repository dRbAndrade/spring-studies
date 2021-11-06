package interfaceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("interfaceinjection/config.xml");
		OrderBO orderBO = (OrderBO)context.getBean("orderBO");
		orderBO.placeOrder();
	}

}
