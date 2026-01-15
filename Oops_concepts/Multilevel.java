package Oops_concepts;

public class Multilevel {
	
    String type = "Human";

    public void working() {
        System.out.println("Humans are continously working.");
    }

    public static void main(String[] args) {
        kid p = new kid();
        p.working();        
        p.works();       
        p.sleep();      
    }
}

class Adult extends Multilevel {
    public void works() {
        System.out.println("Adult goes to work.");
    }
}

class kid extends Adult {
	
    public void sleep() {
        System.out.println("kid sleeps.");
    }
}


