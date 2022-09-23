package courseSystemDemo;

public class Course {
	
	int courseID;
	String courseName;
	String content;
	
	public Course(int courseID, String courseName, String content ) {
		
		this.courseID = courseID;
		this.courseName = courseName;
		this.content = content;
	}
	
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
