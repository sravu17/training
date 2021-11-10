
public class Member {
private String name;
private Book book;
public Member(String name) {
	super();
	this.name = name;
}
	public void status() throws BalanceException {
		if(book == null)
			//System.out.println(name +" " + "has not issued any book");
			throw new BalanceException("Book not issued");
		else
			System.out.println(name + " had been issued " + book.getTitle());
	}
	public String getName() {
		return name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
 