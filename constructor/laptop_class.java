package constructor;

public class laptop_class {
	int price;
	String brand;
	
	void compare(laptop_class l) {
        if (this.price > l.price) {
            System.out.println(this.brand + " is costlier");
        } else if (this.price < l.price) {
            System.out.println(l.brand + " is costlier");
        } else {
            System.out.println("Both laptops have same price");
        }
    }
	
	
	public laptop_class(String brand, int price) {
		this.price = price;
		this.brand = brand;
	}
	
	public static void main(String[] args) {
		laptop_class l1 = new laptop_class("hp",20000);
		laptop_class l2 = new laptop_class("dell",90000);
		
		
		l1.compare(l2);
		
		
	}

}
