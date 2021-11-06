package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Properties Set"); 
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying");
		
	}


	
	
	
	
}
