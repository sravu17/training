package ex4;

public class TextMessage implements Message {

	public TextMessage() {
		System.out.println("Textmessage constructor");
	}
	@Override
	public void send(String to, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Message sent to "+ to + " as " + msg);
	}

}
