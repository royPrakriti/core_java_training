package has_a_relationship;

public class Person {
	
	String name;
	pancard pancard;
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Dinga";
		
		pancard card = new pancard();
		card.panId = "ABCDE@#$";
		card.dob = "14/04/2001";
		
		person.pancard = card;
		
		System.out.println(person.name);
		System.out.println(person.pancard.panId);
		System.out.println(person.pancard.dob);
		
	}

}
