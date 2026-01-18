package has_a_relationship;

public class Trainer {
	
	private String name;
	private Student Student;
	private String Subject;
	
	public void setStudent(Student Student) {
		this.Student = Student;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public void setsubject(String Subject) {
		this.Subject = Subject;
	}
	
	public Student getStudent() {
		return Student;
	}
	
	public String getname() {
		return name;
	}
	
	public String getSubject() {
		return Subject;
	}

}
