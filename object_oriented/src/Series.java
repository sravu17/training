
public class Series extends Media {
private int seasonNo;
	public Series() {
		// TODO Auto-generated constructor stub
	}

	public Series(String title, String genre,int seasonNo) {
		super(title, genre);
		this.seasonNo = seasonNo;
	}

	@Override
	public void play() {
		super.play();
		System.out.println("Number of seasons:"+ seasonNo);
	}
	

}
