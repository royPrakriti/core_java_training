package Oops_concepts;

public class Vehicle_1 {

	    String name;
	    int no_of_users;

	    public static void main(String[] args) {

	        Bike b = new Bike("BikeApp", 10000, "Two Wheeler");
	        System.out.println(b.name);
	        System.out.println(b.no_of_users);
	        System.out.println(b.type);

	        System.out.println("-----");

	        Car c = new Car("CarApp", 809990, 90000);
	        System.out.println(c.name);
	        System.out.println(c.no_of_users);
	        System.out.println(c.no_of_downloads);
	    }
	}

	// Child 1
	class Bike extends Vehicle_1 {

	    String type;

	    Bike(String name, int no_of_users, String type) {
	        this.name = name;
	        this.no_of_users = no_of_users;
	        this.type = type;
	    }
	}

	// Child 2
	class Car extends Vehicle_1 {

	    long no_of_downloads;

	    Car(String name, int no_of_users, long no_of_downloads) {
	        this.name = name;
	        this.no_of_users = no_of_users;
	        this.no_of_downloads = no_of_downloads;
	    }
	}
	
	



