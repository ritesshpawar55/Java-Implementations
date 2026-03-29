public class Student {
	private int sid;
	private String name;
	private double gpa;
	
	public Student(int sid, String name, double gpa) {
		
		this.sid = sid;
		this.name = name;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", gpa=" + gpa + "]";
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}
}
