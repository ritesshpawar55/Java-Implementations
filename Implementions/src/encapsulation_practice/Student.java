package encapsulation_practice;

class Student {
    private int age;

    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
		Student s = new Student();
		s.setAge(11);
		System.out.println(s.getAge());
	}
}
