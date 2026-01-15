package Oops_concepts;

public class Apple extends FRUIT {
	double price;
	Apple( String color, String name, double price){
		this.name = name;
		this.color = color; //inherited
		this.price = price;//inherited
	}
	
	
	
	public static void main(String[] args) {
		Apple F = new Apple("Apple","red",90);
		System.out.println(F.name);
		System.out.println(F.color);
		System.out.println(F.price);
		
	}

}
