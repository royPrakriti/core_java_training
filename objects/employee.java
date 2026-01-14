package objects;

public class employee {
	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name + " is working");
	}
	
	public static void main(String[] args) {
		employee e1 = new employee();
		e1.id = 101;
		e1.name = "Prakriti";
		e1.salary = 5.00;
		e1.work();
	}
	
	public void printemp(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}

}
