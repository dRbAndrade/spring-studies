package standalonecollections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollections/config.xml");
		ProductList productList = (ProductList) context.getBean("productList");
		System.out.println(productList);

	}

}
