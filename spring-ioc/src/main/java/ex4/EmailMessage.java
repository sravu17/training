package ex4;

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
