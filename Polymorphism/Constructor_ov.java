package Polymorphism;

public class Constructor_ov {
	
	int id;
	String name;
	int Salary;
	String Dept;
	
	public Constructor_ov(int id) {
		this.id = id;
	}
	
	public Constructor_ov(int id, String name) {
		this(id);
		this.name = name;
	}
	
	public Constructor_ov(int id, String name,int Salary) {
		this(id, name);
		this.Salary = Salary;
		
	}
	
	public Constructor_ov(int id, String name,int Salary,String Dept) {
		this(id, name, Salary);
		this.Dept = Dept;
		
	}
	
	public void printemployee() {
		System.out.println("\nemployee details");
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("salary" + Salary);
		System.out.println("Dept:" + Dept);
	}
	
	public static void main(String[] args) {
		Constructor_ov c = new Constructor_ov(20);
		c.printemployee();
		
		Constructor_ov c1 = new Constructor_ov(20,"Prakriti");
		c1.printemployee();
		
		Constructor_ov c2 = new Constructor_ov(20, "Prakriti",89328);
		c2.printemployee();
		
		Constructor_ov c3 = new Constructor_ov(20, "wdsh", 9320, "cse");
		c3.printemployee();
	}

}
