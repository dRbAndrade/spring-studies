package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println("Customer id: " + customer.getProducts());
		System.out.println("customer products: ");
		customer.getProducts().forEach((k,e)->System.out.printf("%-5s%s%n",k,e));
	}

}
