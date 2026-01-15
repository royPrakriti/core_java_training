package Oops_concepts;

public class heirerchial_inh {
		String name;
		int no_of_users;
		
		
		public static void main(String[] args) {
			instagra i = new instagra("whatsapp",10000,"communication");
			System.out.println(i.name);
			System.out.println(i.no_of_users);
			System.out.println(i.Type);
			
			whatsapp w = new whatsapp("instagram",809990,90000);
			System.out.println(w.name);
			System.out.println(w.no_of_users);
			System.out.println(w.no_of_downloads);
			
			
			
			
		}
		

	}

	class instagra extends heirerchial_inh{
		public String Type;
		
		
		instagra(String name, int no_of_users,String Type){
			this.name = name;
			this.no_of_users = no_of_users;
			this.Type = Type;
			
		
			
		}
		
		
		
		
	}
	
	class whatsapp extends heirerchial_inh{
		long no_of_downloads;
		
		
		whatsapp(String name, int no_of_users, long no_of_downloads){
			this.name = name;
			this.no_of_users = no_of_users;
			this.no_of_downloads = no_of_downloads;
			
			
		
			
		}

}
