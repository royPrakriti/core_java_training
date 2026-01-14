package constructor;

public class Product {
	
	int id;
	String name;
	int price;
	int rating;

	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public Product(int id, String name,int price) {
		this.id = id;
		this.name = name;
		this.price = price;
				
	}
	
	public Product(int id, String name,int price, int rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public void display() {
        System.out.println("----------------------");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Price  : " + price);
        System.out.println("Rating : " + rating);
        System.out.println("----------------------");
    }
	
	
	public static void main(String[] args) {
		Product p1 = new Product(12, "Pen");
		Product p2 = new Product(15, "book",120);
		Product p3 = new Product(18, "mobile",12000,5);
		
		p1.display();
		p2.display();
		p3.display();
		
		
		
	}
	

}
