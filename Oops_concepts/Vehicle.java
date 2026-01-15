package Oops_concepts;

public class Vehicle {
	String Brand;
	String colour;
	double price;
	
	public void printVehicle() {
		System.out.println(Brand);
		System.out.println(colour);
		System.out.println(price);
		
	}
	
	public static void main(String[] args) {
		bike b = new bike("BMW","Black", 150);
		b.printVehicle();
	}

}

class bike extends Vehicle{
	bike(String Brand, String colour, double price){
		this.Brand = Brand;
		this.colour = colour;
		this.price = price;
	}
}
