package Oops_concepts;

public class app {
	String name;
	int no_of_users;
	long no_of_downloads;
	
	public static void main(String[] args) {
		instagram i = new instagram("whatsapp",10000,1829982,"communication");
		System.out.println(i.name);
		System.out.println(i.no_of_users);
		System.out.println(i.no_of_downloads);
		System.out.println(i.Type);
	}
	

}

class instagram extends app{
	public String Type;
	
	
	instagram(String name, int no_of_users, long no_of_downloads,String Type){
		this.name = name;
		this.no_of_users = no_of_users;
		this.no_of_downloads = no_of_downloads;
		this.Type = Type;
		
	
		
	}
	
	
}
