package has_a_relationship;

public class Car2 {
	
	private int id;
	private String color;
	private String brand;
	
	private Engine Engine;
	
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
		
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	public Engine getEngine() {
		return Engine;
	}
	public void setEngine(Engine Engine) {
		this.Engine = Engine;
	}
	
	public static void main(String[] args) {
		
		
        Engine e = new Engine();
        e.setcc(101);
        e.settype("Petrol");

        
        Car2 c = new Car2();
        c.setid(1);
        c.setbrand("BMW");
        c.setcolor("Black");
        c.setEngine(e);   // HAS-A linking

       
        System.out.println("Car ID: " + c.getid());
        System.out.println("Brand: " + c.getbrand());
        System.out.println("Color: " + c.getcolor());
        System.out.println("Engine No: " + c.getEngine().getcc());
		
	}

}
