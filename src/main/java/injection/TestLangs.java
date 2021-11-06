package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLangs {

	public static void main(String[] args) {



		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/injection/langconfig.xml");
		Language langs = (Language) context.getBean("properties");
		System.out.println(langs.getCountryAndLangs());
	}

}
