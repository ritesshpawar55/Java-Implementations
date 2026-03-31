//package Practice;
//import java.util.*;
//
//class Student implements Comparable<Student> {
//    String name;
//    int age;
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
////    public int compareTo1(Student s) {
////        return s.age - this.age;
////    }
//    
//
//    public String toString() {
//        return name + "(" + age + ")";
//    }
//
////	@Override
////	public int compareTo(Student o) {
////		// TODO Auto-generated method stub
////		return 0;
////	}
//}
//
//public class Test {
//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("Ritessh", 23));
//        list.add(new Student("Mom", 48));
//        list.add(new Student("Vaishnavi", 20));
//        
//        Collections.sort( list, (s1, s2) -> Integer.compare(s2.age, s1.age));
//        //Collections.sort(list);
//        System.out.println(list);
//    }
//}