package Polymorphism;



class Mapv1{
	
	void route() {
		System.out.println("Direction");
		
	}
}


class Mapv2 extends Mapv1{
	@Override
	
	public void route() {
		System.out.println("Direction and duration together.");
	}
	
}

class Mapv3 extends Mapv2{
	public void boocab() {
		System.out.println("you can book your cab here");
	}
}

public class Map {
	public static void main(String[] args) {
		
		Mapv1 m = new Mapv1();
		m.route();
		Mapv2 a = new Mapv2();
		a.route();
		
		Mapv3 p = new Mapv3();
		p.route();
		p.boocab();
		
		Mapv1 v1 = new Mapv3();
		v1.route();
		
		Mapv3 v3 = (Mapv3) v1;
		v3.route();
		v3.boocab();
		
		
	}
}


