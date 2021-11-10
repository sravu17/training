
public class Book {
private String title;
private Member mbr;
	
	
	public Book(String title) {
	super();
	this.title = title;
	
}
	public void status() {
		if(mbr==null)
			System.out.println(title + " "+"is not issued to anyone");
		else
			System.out.println(title+ " "+ "is issued to" + mbr.getName());
	}
	public String getTitle() {
		return title;
	}
	public void issueBook(Member m) {
		if(mbr != null)
			System.out.println(title + " "+ "is already issued");
		else if(m.getBook() != null)
			System.out.println(m.getName()+" "+ "had already issued a book");
		else {
			mbr = m;
			m.setBook(this);
			System.out.println("Book issued");
			
		}
		
	}
	public void returnBook(Member m) throws BalanceException {
		if(mbr == null)
			throw new BalanceException(title + " "+ "is not issued to anyone");
			//System.out.println(title + " "+ "is not issued to anyone");
		else if(m.getBook() ==  null)
			System.out.println(m.getName()+ " "+" had never issued a book");
		else if(!m.getBook().getTitle().equals(title))
			System.out.println(m.getName()+"has not issued"+ title);
		else if(!m.getName().equals(mbr.getName()))
		System.out.println(title + "was not issued to"+m.getName());
		else
		{
			
			m.setBook(this);
			mbr = null;
			System.out.println("Book returned");
			
		}
	}

}
