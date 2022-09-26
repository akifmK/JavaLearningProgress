public class StudentManager extends UserManager{



    public void addToClass(Student student){
        System.out.println(student.getFirstName()+" " + student.getLastName() + " hase been added to class as student");
    }

    public void getKicked(Student student){
        System.out.println("Student with code " + student.getUserCode() +" has been kicked from class");
    }
}
