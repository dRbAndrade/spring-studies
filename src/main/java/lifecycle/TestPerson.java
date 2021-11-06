package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestPerson {

    public static void main(String[] args) {


        @SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/lifecycle/config.xml");
        context.registerShutdownHook();
        
        
    }


}
