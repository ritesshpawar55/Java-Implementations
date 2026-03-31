package Practice;

public class Emp {
	private int id;
	String name;
	private double sal;
	
	
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}
}
