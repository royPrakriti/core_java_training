package Oops_concepts;
import java.util.Scanner;

public class Bank_account_class {
	private int id;
	private int balance;
	private int pass;
	
	
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
	
	public double getbalance(int pass) {
		if (this.pass != pass) {
	        System.out.println("wrong password");
	        return 0;
	    }

	    if (balance <= 0) {
	        System.out.println("invalid balance");
	        return 0;
	    }

	    return balance;
		
	}
	
	public void setbalance(int balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank_account_class T = new Bank_account_class();
		T.setbalance(15627);
		T.setid(12);
		
		T.setpass(88);
		
		System.out.print("Enter password to view balance: ");
        int inputPass = sc.nextInt();
		
		
		System.out.println(T.getbalance(inputPass));
		System.out.println(T.getid());
		
		
	}

}
