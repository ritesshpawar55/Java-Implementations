package person;
class Person{
	
	String name;
	int age;
	String country;

	void setter(String n, int a, String c){
		this.name=n;
		this.age=a;
		this.country=c;	
	}

	Person(String name, int age, String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}
	
	@Override
	public String toString(){
		return String.format("Person[name=%s, age=%d, country=%s]", name, age, country);
	}
	
	void compareAge(Person p){
		if(this.age>p.age)
			System.out.println("1st one is Older");
		else if(this.age<p.age)
			System.out.println("2nd one is Older");
		else
			System.out.println("same age");
	}
}