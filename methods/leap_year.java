package methods;

public class leap_year {
	public static void isleapyear(int a) {
		
		if (a % 400 == 0) {
	        System.out.println(a + " is a leap year");
	    } else if (a % 100 == 0) {
	        System.out.println(a + " is not a leap year");
	    } else if (a % 4 == 0) {
	        System.out.println(a + " is a leap year");
	    } else {
	        System.out.println(a + " is not a leap year");
	    }
	}
	
	public static void main(String[] args) {
		isleapyear(2016);
		
	}

}
