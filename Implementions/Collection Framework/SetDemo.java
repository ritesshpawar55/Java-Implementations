import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet();
		
		s.add(4);
		s.add(12345);
		s.add(500061);
		s.add(36);
		s.add(null);
		s.add(4); // no duplicate allowed. 
		  
		System.out.println(s); // NSO
		
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
