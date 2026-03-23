package Task_1;

class Person{
	String name;
	int age;
	String country;

	Person(){}

	void setData(String n, int a, String c){
		this.name=n;
		this.age=a;
		this.country=c;	
	}

	Person(String name, int age, String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}

	void disp(){
		System.out.println("name: "+this.name);
		System.out.println("age: "+this.age);
		System.out.println("country: "+this.country);
	}

	void dispNameAge(String name, int age, String country){
		name=name;
		age=age;
		country=country;

		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("country: "+country);
	}

	void getData(){
		System.out.println(name+" "+age+" "+country+" ");
	}

	void compareAge(Person p){
		if(this.age>p.age)
			System.out.println("1st one is Older");
		else if(this.age<p.age)
			System.out.println("2nd one is Older");
		else
			System.out.println("same age");
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setData("Vaishnavi", 19, "India");

		Person p2 = new Person("Ritessh", 22, "India");
		p.getData();
		p2.getData();

		p.disp();
		p2.disp();
		p.compareAge(p2);
	}
}












		