package ex8;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("email")
@Lazy
public class EmailMessage implements Message {

	public EmailMessage() {
		System.out.println("Email constructor");
	}
	@Override
	public void send(String to, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to " + to + " as " + msg);
	}

}
