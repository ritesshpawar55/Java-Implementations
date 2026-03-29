package Practice;
import java.util.*;

public class EmpApp {
	public static void main(String[] args) {
			List<Emp> l = new ArrayList();
			
			l.add(new Emp(111, "A", 11.11));
			l.add(new Emp(444, "B", 22.22));
			l.add(new Emp(333, "C", 33.33));
			l.add(new Emp(555, "D", 55.55));
			l.add(new Emp(999, "E", 44.44));
			l.add(new Emp(888, "F", 44.44));
			//l.remove(1);
			//System.out.println(l);
			
			Collections.sort(l, new Comparator<Emp>() {
				@Override
				public int compare(Emp s1, Emp s2) {
					return s1.getName().compareTo(s2.getName()); // ASC - sorting by name i.e strings
					//return Integer.compare(s1.getId(), s2.getId()); // sorting by id i.e int
				}
			});
			
			//l.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));  // lambda - ASC order - sort by String getName, used compareTo
			//l.sort((s3 , s4) -> Integer.compare(s4.getId(), s3.getId()));  //dsc order - sort by Id integer, used compare
			
			//System.out.println(l);
			
			//Collections.sort(l, new Cons());
			
			//l.remove();
			
			
			Iterator<Emp> itr = l.iterator(); 
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}
}
