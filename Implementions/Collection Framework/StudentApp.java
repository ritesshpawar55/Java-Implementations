import java.util.*;

public class StudentApp {
	public static void main(String[] args) {
		List<Student> studList = new ArrayList();
		studList.add(new Student(1, "ABC", 8.7));
		studList.add(new Student(22, "XYZ", 7.7));
		studList.add(new Student(333, "QWERTY", 9.7));
		studList.add(new Student(4444, "PQR", 8.7));
		studList.add(new Student(5555, "MVR", 6.7));

		System.out.println(studList);

	Collections.sort(studList, new Comparator<Student>() {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName()); // ASC
		}
	}); //

		Iterator itr = studList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
