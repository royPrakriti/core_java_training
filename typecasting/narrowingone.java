package typecasting;

public class narrowingone {
	public static void main(String[] args) {
		double x = 10.75;
        int y = (int) x;   // narrowing

        System.out.println(x); 
        System.out.println(y);
	}

}
