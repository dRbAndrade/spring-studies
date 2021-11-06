package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCart {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/injection/assingmentconfig.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");
		System.out.println(cart.getItem());
	}

}
