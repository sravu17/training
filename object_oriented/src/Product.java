
public class Product {
private int code;
private String name;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}

private double price;
private int stock;
private static int codegen = 101;
public Product( String name, double price, int stock) {
	super();
	this.code = codegen ++;
	this.name = name;
	this.price = price;
	this.stock = stock;
}
public double getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}

public String getName() {
	return name;
}

public void description() {
	System.out.println("Code:"+ code);
	System.out.println("Name:"+ name);
	System.out.println("Price:" + price);
	System.out.println("stock:" + stock);
}

}
