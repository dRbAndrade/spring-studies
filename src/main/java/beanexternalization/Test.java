package beanexternalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beanexternalization/config.xml");
		DAO dao = (DAO) context.getBean("dao");
		System.out.println(dao);
	}

}
