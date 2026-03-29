import java.util.*;
public class ALDemo {
	public static void main(String[] args) {
		List<String> al = new LinkedList();
		al.add("4th Floor");
		al.add("Mytri Vihar");
		al.add("Ameerpet");
		al.add("Hyderabad");
		al.add("500061");
		System.out.println(al);
		
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(itr.previous());
		Collections.sort(al);
		System.out.println(al);
		
	}
	
}
