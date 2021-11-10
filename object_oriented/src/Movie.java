
public class Movie extends Media {
private String lang;
private int seasonNo;
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, String genre,String lang, int seasonNo) {
		super(title, genre);
		this.lang = lang;
		this.seasonNo = seasonNo;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.play();
		System.out.println("Language:"+lang);
		System.out.println("Number of seasons:"+ seasonNo);
	}

}
