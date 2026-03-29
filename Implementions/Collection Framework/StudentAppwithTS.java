
import java.util.*;
public class StudentAppwithTS {
	public static void main(String[] args) {
		Set<Student> studSet = new LinkedHashSet();
		studSet.add(new Student(123, "ABC", 8.7));
		studSet.add(new Student(125, "XYZ", 7.7));
		studSet.add(new Student(199, "QWERTY", 9.7));
		studSet.add(new Student(139, "PQR", 8.7));
		studSet.add(new Student(101, "MVR", 6.7));

		System.out.println(studSet);
		
		Iterator itr = studSet.iterator();
		int count = 0;
		while (itr.hasNext()) {
			System.out.println(itr.next());
			count++;
			if(count==3)
				break;
		}
	}
}
