
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.add(10);
		s.addElement(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(s.pop());
		System.out.println(s.peek()); // TOS
		System.out.println(s.pop());
		System.out.println();
		Enumeration en = s.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
		
		
		
	}
}
