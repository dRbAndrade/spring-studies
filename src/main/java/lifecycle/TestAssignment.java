package lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAssignment {

    public static void main(String[] args) {


        @SuppressWarnings({ "resource", "unused" })
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("br/com/drbandrade/springindian/lifecycle/assignmentconfig.xml");
        
        
    }


}
