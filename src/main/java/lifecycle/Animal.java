package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Animal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Properties set on Animal");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying animal");
	}

}
