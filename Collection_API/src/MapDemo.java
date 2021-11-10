import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Jack", "Jill");
		map.put("Scott", "tiger");
		map.put("polo", "lili");
		map.put("Jack", "rose");
		
		/*System.out.println(map.get("Scott"));
		System.out.println(map.get("polo"));
		System.out.println(map.get("Jack"));*/
		
		for(String key : map.keySet()) {
			System.out.println(key+": "+ map.get(key));
		}
		
		
	}

}
