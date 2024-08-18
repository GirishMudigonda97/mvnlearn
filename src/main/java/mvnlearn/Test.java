package mvnlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		 Service sc = (Service) ac.getBean("service");
		 System.out.println(sc);
	}
}
