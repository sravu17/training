import java.util.ArrayList;

public class ShoppingCart {
	//private Product[] items;
	private double total;
	//private int idx;
	private ArrayList<Product> items;

	public ShoppingCart() {
		items = new ArrayList<>();
	}

	public void addItem(Product p) { // calling an object p of product
		//items[idx] = p; // assigning no.of items to p
	
		//for(int i =0 ; i<list.size();i++)
			items.add(p);
			System.out.println(p.getCode() + p.getName() + "added to cart");
		total += p.getPrice(); // total sum = total + prices of the products so calling them from product
		//System.out.println(p.getCode() + p.getName() + "added to cart");
	}

	public void checkout() { // print
		System.out.println("Your Shopping cart");
		for (Product p : items) 
			p.description();
		System.out.println("Cart Total:" + total);
		
	
	}
}