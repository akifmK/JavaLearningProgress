public class Student extends User{
    private String grade;
    private String interest;

    public Student(){

    }
    public Student(int id, String firstName, String lastName , String grade, String interest){

        this.grade=grade;
        this.interest=interest;
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);


    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
