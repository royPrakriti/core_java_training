package core_java;

public class operators {
	public static void main(String[] args) {
		//arithmetic
		int a = 3;
		float b = 6.5f;
		int sum = (int) (a + b);
		
		System.out.println(sum);
		
		int c = 3;
		float d = 6.5f;
		int sum1 = (int) (c - d);
		
		System.out.println(sum1);
		
		//assignment
		int a1 = 5;
		int b1 = 10;
		b1 *= a1;
		b1 += a1;
		b1 /= a1;
		
		System.out.println(b1);
		
		//relational
		
		int a2 = 10, b2 = 5;
		System.out.println(a2 > b2);
		
		
		int x = 3, y = 8;
		System.out.println(x < y);  
		
		int marks = 40;
		System.out.println(marks >= 35);  
		
		//logical
		boolean isMarried = false;

		if (!isMarried) {
		    System.out.println("Single");
		}

		int age = 20;
		int marksone = 60;

		if (age >= 18 && marksone >= 50) {
		    System.out.println("Eligible");
		}
		
		//string concatenation
		
		String firstName = "John";
		String lastName = "Doe";

		String fullName = firstName + " " + lastName;
		System.out.println(fullName);

		
				
				
				
		
		
	}

}
