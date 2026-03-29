
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		
		Map hm = new TreeMap();
		hm.put(123, "ABC");
		hm.put(199,"XYZ ");
		hm.put(139, "ASDF");
		hm.put(123, "PQR"); //?
		hm.put(100,"ABC"); 
		
		System.out.println(hm);

	}
}
