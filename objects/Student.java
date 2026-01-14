package objects;
import java.util.*;

public class Student {
	String location;
	String name;
	int placements;
	
	public void exam() {
		System.out.println(name +" is taking the exam");
	}
	
	public void printemployee() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(placements);
		
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("name:");
		s.name = sc.next();
		System.out.println("location:");
		s.location = sc.next();
		System.out.println("placements:");
		s.placements = sc.nextInt();
		
		Student s1 = new Student();
		s1.name= "institute of enginneering and management";
		s1.location = "college more";
		s1.placements = 160;
		s1.printemployee();
		s1.exam();
		
		
	}


}
