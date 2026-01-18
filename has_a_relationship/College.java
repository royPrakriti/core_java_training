package has_a_relationship;

public class College {
	
	private String name;
	private String location;
	private Student Student;
	private Trainer Trainer;
	
	
	public String getname() {
	    return name;
	}

	public void setname(String name) {
	    this.name = name;
	}

	public String getlocation() {
	    return location;
	}

	public void setlocation(String location) {
	    this.location = location;
	}

	public Student getStudent() {
	    return Student;
	}

	public void setStudent(Student Student) {
	    this.Student = Student;
	}

	public Trainer getTrainer() {
	    return Trainer;
	}

	public void setTrainer(Trainer Trainer) {
	    this.Trainer = Trainer;
	}

	public static void main(String[] args) {
		College c = new College();
		c.setname("IEM");
		c.setlocation("collegemore");
		
		
		
		Trainer T = new Trainer();
		T.setname("Sandeep Chavan");
		T.setsubject("Core Java");
		
		
		Student s = new Student();
		s.setid(122);
		s.setname("Prakriti Roy");
		
		T.setStudent(s);
		
		
		c.setStudent(s);
		c.setTrainer(T);
		
		
		System.out.println(c.getname());
        System.out.println(c.getlocation());

        System.out.println(c.getTrainer().getname());
        System.out.println(c.getTrainer().getSubject());

        System.out.println(c.getStudent().getid());
        System.out.println(c.getStudent().getname());
		
		
		
				
	}

}
