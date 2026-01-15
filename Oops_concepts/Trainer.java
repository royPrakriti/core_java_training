package Oops_concepts;

public class Trainer {
	
	private int id;
	private String Name;
	private int pass;
	
	
	public int getid() {
		return id;
	}
	
	
	public void setid(int id) {
		this.id = id;
	}
	
	public int getpass() {
		return pass;
	}
	
	public void setpass(int pass) {
		this.pass = pass;
	}
	
	public String getname() {
		return Name;
	}
	
	public void setname(String Name) {
		this.Name = Name;
	}
	
	public static void main(String[] args) {
		Trainer T = new Trainer();
		T.setname("raju");
		T.setid(12);
		T.setpass(27288);
		System.out.println(T.getname());
		System.out.println(T.getid());
		System.out.println(T.getpass());
		
	}

}
