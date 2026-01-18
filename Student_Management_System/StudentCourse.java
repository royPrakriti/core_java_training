package Student_Management_System;

public class StudentCourse {
	
	private Student Student;
	private Course Course;
	
	
	public void setCourse(Course Course) {
		this.Course = Course;
	}
	
	public void setStudent(Student Student) {
		this.Student = Student;
	}
	
	public void showStudentCoursedetails() {
		//1st student
		
		StudentCourse s1 = new StudentCourse();
		
		Student st = new Student();
		st.setname("Prakriti Roy");
		st.setage(21);
		st.setroll_no(120);
		st.setgrade("A");
		
		Course c = new Course();
		c.setCourse_id(20);
		c.setCourse_name("CSE");
		
		s1.setCourse(c);
		s1.setStudent(st);
		
		//2nd student
		
		
		Student st1 = new Student();
		st1.setname("Subhashree Roy");
		st1.setage(22);
		st1.setroll_no(121);
		st1.setgrade("B");
		
		
		Course c1 = new Course();
		
		c1.setCourse_id(24);
		c1.setCourse_name("IT");
		
		StudentCourse s2 = new StudentCourse();
		
		
		s2.setStudent(st1);
		s2.setCourse(c1);
		
		
		//3rd student
		
		Student st2 = new Student();
		st2.setname("Subhashree Roy");
		st2.setage(22);
		st2.setroll_no(121);
		st2.setgrade("B");
		
		
		Course c2 = new Course();
		
		c2.setCourse_id(24);
		c2.setCourse_name("IT");
		
		StudentCourse s3 = new StudentCourse();
		
	
		s3.setStudent(st2);
		s3.setCourse(c2);
		
		
		
		System.out.println("Student 1 Details");
		System.out.println(s1.Student.getname());
		System.out.println(s1.Student.getage());
		System.out.println(s1.Student.getroll_no());
		System.out.println(s1.Student.getgrade());
		System.out.println(s1.Course.getCourse_id());
		System.out.println(s1.Course.getCourse_name());

		System.out.println("Student 2 Details");
		System.out.println(s2.Student.getname());
		System.out.println(s2.Student.getage());
		System.out.println(s2.Student.getroll_no());
		System.out.println(s2.Student.getgrade());
		System.out.println(s2.Course.getCourse_id());
		System.out.println(s2.Course.getCourse_name());

		System.out.println("Student 3 Details");
		System.out.println(s3.Student.getname());
		System.out.println(s3.Student.getage());
		System.out.println(s3.Student.getroll_no());
		System.out.println(s3.Student.getgrade());
		System.out.println(s3.Course.getCourse_id());
		System.out.println(s3.Course.getCourse_name());

		
		
		
		
	}
	
	public static void main(String[] args) {
		
		StudentCourse sc = new StudentCourse();
        sc.showStudentCoursedetails();
		
		
		
	}

}
