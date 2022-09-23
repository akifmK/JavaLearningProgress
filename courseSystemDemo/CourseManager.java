package courseSystemDemo;

public class CourseManager {
	
	
	public void assignTeacherToCourse(Teacher teacher, Course course) {
		
		System.out.println("Teacher with ID " + teacher.teacherID + "  has been appointed to the course with ID "+ course.courseID+".");
	}
	
	public void addStudentToCourse(Student student, Course course) {

		System.out.println("Student with ID " + student.studentID + " has been added to the course with ID " + student.studentID+".");
	}

}
