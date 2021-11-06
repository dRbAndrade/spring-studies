package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings({ "resource", "unused" })
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection/config.xml");

	}

}
