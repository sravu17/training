
public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("The girl in 105");
		Member m1 = new Member("sravani");
		b1.status();
		try {
			m1.status();
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		b1.issueBook(m1);

		try {
			b1.returnBook(m1);
		} catch (BalanceException e) {

			e.printStackTrace();

		}
		b1.status();
		try {
			m1.status();
		} catch (BalanceException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
