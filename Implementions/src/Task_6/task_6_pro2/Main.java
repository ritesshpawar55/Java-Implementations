package person;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Vaishnavi", 19, "India");
		System.out.println(p);

		Person p2 = new Person("Ritessh", 22, "India");
		System.out.println(p2);

		p.compareAge(p2);
	}

}
