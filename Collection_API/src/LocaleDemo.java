import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
public static void main(String[] args) {
//Locale desi = new Locale("hi");
	//ResourceBundle msgs = ResourceBundle.getBundle("msgs",Locale.FRENCH);
ResourceBundle msgs = ResourceBundle.getBundle("msgs",Locale.KOREAN);
	//ResourceBundle msgs = ResourceBundle.getBundle("msgs",desi);
	System.out.println(msgs.getString("greeting"));
	System.out.println(msgs.getString("message"));
}
}
