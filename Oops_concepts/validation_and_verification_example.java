package Oops_concepts;
import java.util.Scanner;

public class validation_and_verification_example {
	
	    private String name;
		private int id;
		private int result;
		private int pass;
		
		
		public String getname() {
			return name;
		}
		
		public void setname(String name) {
			this.name = name;
		}
		
		public int getid() {
			return id;
		}
		
		
		public void setid(int id) {
			this.id = id;
		}
		
		public int getpass() {
			return pass;
		}
		
		public void setpass(int pass) {
			this.pass = pass;
		}
		
		public double getresult(int pass) {
			if (this.pass != pass) {
		        System.out.println("invalid password");
		        return 0;
		    }

		    if (result < 30) {
		        System.out.println(name + "Failed");
		        
		    }

		    return result;
			
		}
		
		public void setresult(int result) {
			this.result = result;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			validation_and_verification_example T = new validation_and_verification_example();
			T.setresult(77);
			T.setid(12);
			
			T.setpass(88);
			T.setname("Prakriti");
			
			System.out.print("Enter password to view balance: ");
	        int inputPass = sc.nextInt();
			
			
			System.out.println(T.getresult(inputPass));
			System.out.println(T.getid());
			
			
		}

}



