package courseSystemDemo;

public class Student {
	
	int studentID;
    String firstName;
    String lastName;
    String hobbies;
    
    
    public Student(int studentID , String firstName, String lastName, String hobbies) {
    	
    	this.studentID = studentID;
    	this.firstName = firstName;
    	this.lastName = lastName;
        this.hobbies = hobbies;
            
    }
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
	
	public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void setCertificate(String hobbies) {
		this.hobbies = hobbies;
	}
    
    
 

}
