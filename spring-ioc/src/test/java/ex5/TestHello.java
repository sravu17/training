package ex5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex5.Hello;

public class TestHello {
	@Test
	public void testMessage() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("appctx.xml");
		Hello h = (Hello) appCtx.getBean("hi");
		
		System.out.println("Message : " + h.getMessage());
	
	
	}

}
