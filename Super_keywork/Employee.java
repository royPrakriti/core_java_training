package Super_keywork;

public class Employee extends Human {
	
	int id;
	int salary;
	
	public Employee(String Name, int age, String gender,int id,int salary) {
		
		super(Name, age, gender);
		this.id = id;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Prakriti Roy", 21, "Female", 122, 32098);
		System.out.println(e.Name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.id);
		System.out.println(e.salary);
		
		
		
		
		
	}

}
