package Super_keywork;

public class Product_ex {
	
	String brand;
	
	public Product_ex(String brand) {
		this.brand = brand;
		
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile("Vivo","Airtel",25000);
		System.out.println(m.brand);
		System.out.println(m.price);
		System.out.println(m.Sim);
		
	}
	

}

class Mobile extends Product_ex{
	
	int price;
	String Sim;
	
	public Mobile(String brand, String Sim, int price) {
		super(brand);
		this.price = price;
		this.Sim = Sim;
		
	}
	
}

class laptop1 extends Product_ex{
	
	int price_lap;
	String Processor;
	
	public laptop1(String brand, String Processor, int price_lap) {
		super(brand);
		this.Processor = Processor;
		this.price_lap = price_lap;
		
	}
}

