package operator;

import java.util.Scanner;

public class book_accordingto_the_day {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the day: ");
        String day = sc.next().toLowerCase(); 

        switch (day) {
		    case "monday":
		    case "wednesday":
		    case "thursday":
		        System.out.println("English");
		        break;
		
		    case "tuesday":
		    case "saturday":
		        System.out.println("Java");
		        break;
		
		    case "friday":
		        System.out.println("SQL");
		        break;
            	
        }
	}

}
