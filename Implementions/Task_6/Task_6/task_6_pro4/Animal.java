package Task_6.task_6_pro4;

interface Animal {
	
	void makeSound();
	
	void eat();
}

class Dog implements Animal{
    
	public void makeSound() {
        System.out.println("Woof!");
    }
    
    public void eat() {
        System.out.println("Dog eating.");
    }
}

class Cat implements Animal{
	 public void makeSound() {
	        System.out.println("Meow!");
	    }
	    
	    public void eat() {
	        System.out.println("Cat eating.");
	    }
}
