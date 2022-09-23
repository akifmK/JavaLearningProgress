package courseSystemDemo;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher(101,"Memati","BAŞ","Oracle Certificate"); 
		Teacher teacher2 = new Teacher(102,"Abdulhey","HUYUGÜZEL","Eclipse IDE Cerfiticate");
		Teacher[] teachers = {teacher1,teacher2};
		
		
		Course course1 = new Course(201,"Excel","Thinks about Excel");
		Course course2 = new Course(202,"Java","Thinks about Java");
		Course[] courses = {course1,course2};
		
		Student student1 = new Student(301,"Polat","ALEMDAR","Enjoys managing mafia");
		Student student2 = new Student(302,"Süleyman","ÇAKIR","Enjoys managing mafia with canpolat");
		Student[] students = {student1,student2};
		
		CourseManager coursManagement = new CourseManager();
		coursManagement.assignTeacherToCourse(teacher1,course2);
		coursManagement.addStudentToCourse(student2,course2);
		

	}

}
