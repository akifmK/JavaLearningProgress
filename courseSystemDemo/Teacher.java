package courseSystemDemo;

public class Teacher {
	
	int teacherID;
	String firstName;
	String lastName;
	String certificate;
	
	
	public Teacher(int teacherID, String firstName, String lastName ,String certificate) {
		
		this.teacherID = teacherID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.certificate = certificate;
		
	}
	
	public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
	
	public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
	
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}
	
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}
