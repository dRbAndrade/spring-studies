package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestPatient {

    public static void main(String[] args) {


        @SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/lifecycle/config.xml");
        context.registerShutdownHook();
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
    }


}
