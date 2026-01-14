package static_variable;

public class example_1 {
	static int a = 10;
	static int b;
	static String pm = "modi";
	static String c;
	
	public static void e2(){
		System.out.println(Variable_to_acess_at_another_class_withexample1.name);
		System.out.println(Variable_to_acess_at_another_class_withexample1.age);
	}
	
	public static void main(String[] args) {
		e2();
		int a = 20;
		System.out.println(a);//acess the local variable
		System.out.println(example_1.a);//acess the staic variable
		System.out.println(b);//0
		System.out.println(pm);//modi
		System.out.println(c);//null
	}

	

}
