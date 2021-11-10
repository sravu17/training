package ex4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
@Test
public void testSend() {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("ex4ctx.xml");
	
	MessageProcessor mp = (MessageProcessor) ctx.getBean("mp");
	
	mp.process("sms", "6789065", "How are you");
	mp.process("email","abc@mail.com","Hey, You der ?");
}
}
