package scanner_questions;
import java.util.Scanner;

public class personal_details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name:");
		String Name = sc.nextLine();
		System.out.println("age:");
		int age = sc.nextInt();
		System.out.println("phno:");
		String email = sc.nextLine();
		long phno = sc.nextLong();
		System.out.println("married:");
		boolean married = sc.nextBoolean();
		System.out.println("weight:");
		int weight = sc.nextInt();
		System.out.println("gender:");
		String gender = sc.next();
		
		System.out.println("name:" + Name);
		System.out.println("age:" + age);
		System.out.println("phno:" + phno);
		System.out.println("married:" + married);
		System.out.println("weight:" + weight);
		System.out.println("gender:" + gender);
		
		
		
		
		sc.close();
		
	}

}
