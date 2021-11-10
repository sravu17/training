import com.ibm.rays.Alpha;
import com.ibm.rays.Beta;
import com.ibm.rays.Gama;

public class TestRays {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.demo();
		Beta b = new Beta();
		b.show();
		Alpha ab = b;
		ab.demo();
		Beta ba =(Beta)ab;
		Gama g = new Gama();
		g.show();
		Beta bg = g;
		bg.show();
		bg.demo();
		
	}
}
