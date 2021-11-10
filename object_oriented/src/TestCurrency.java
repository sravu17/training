
public class TestCurrency {

	public static void main(String[] args) {
		Dollar usd = new Dollar();
		Ruoee inr = new Ruoee();
		CurrencyConverter cc = new CurrencyConverter();
		Dirham aed = new Dirham();
		System.out.println(cc.convert(100, usd, inr));
		System.out.println(cc.convert(100,aed,inr));
		
	}

}
