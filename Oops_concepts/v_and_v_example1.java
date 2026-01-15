package Oops_concepts;
import java.util.*;

public class v_and_v_example1 {
	
	private String studentName;
    private int studentId;
    private int bookCount;
    private int pin;
    
    
    public void setstudentName(String studentName) {
    	this.studentName = studentName;
    	
    }
    public String getstudentName() {
    	return studentName;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
    
    public int getStudentId(int studentId) {
        return studentId;
    }
    
    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public int getbookCount(int pin) {
    	
    	if (this.pin != pin) {
    		 System.out.println("Invalid Library PIN");
             return 0;
    	}
    	
    	if (bookCount < 0 || bookCount > 5) {
            System.out.println("Invalid book count");
            return 0;
    	}
    	if (bookCount == 0) {
            System.out.println(studentName + " has not issued any books");
        } else {
            System.out.println(studentName + " has issued " + bookCount + " book(s)");
        }
    	
    	return bookCount;
    	
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	v_and_v_example1 v = new v_and_v_example1();
    	
    	v.setstudentName("Mahi");
    	v.setStudentId(45);
    	v.setPin(2222);
        v.setBookCount(0);
        
        System.out.print("Enter library PIN: ");
        int inputPin = sc.nextInt();

        System.out.println("Books Issued: " + v.getbookCount(inputPin));
        System.out.println("Student ID: " + v.getStudentId());
    	
    	
    	
		
	}

}
