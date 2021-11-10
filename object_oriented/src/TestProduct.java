
public class TestProduct {

public static void main(String[] args) {
	ShoppingCart s = new ShoppingCart();
	Product p1 = new Product("Iphone", 56000,10);
	Product p2 = new Product("Samsung",40000,20);
	
	s.addItem(p1);
	s.addItem(p2);
	s.addItem(new Product("Ipad",20000,25));
	s.checkout();
	}

}
