
public class Media {
private String title;
private String genre;
	public Media() {
		
	}
	public Media(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
public void play() {
	System.out.println("Title :"+ title);
	System.out.println("Genre:"+ genre);
}
public static void main(String[] args) {
	 Media m1 = new Media("Hello","Rom-com");
	 m1.play();
	 
	 Media m2= new Media("Vincenzo","Dark-comdey");
	 m2.play();
	}
}
