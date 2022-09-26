public class Main {
    public static void main(String[] args) {

        //You can set user information with two ways//
        // 1.)
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("Selami");
        instructor1.setLastName("Adıgüzel");
        instructor1.setId(201);
        instructor1.setLicence("Java Licence");

        // 2.)
        Instructor instructor2 = new Instructor(202,"Abdulhey","Marazlı","CQL Licence");


        // 1.)
        Student student1 = new Student();
        student1.setFirstName("Maraz");
        student1.setLastName("Ali");
        student1.setId(301);
        student1.setGrade("4");
        student1.setInterest("Playing computer");

        // 2.)
        Student student2 = new Student(302,"Adanalı","Dürümüdüzer","3","Beat criminal");

        // Put the all Users in users arraylist.
        User[] users = new User[]{instructor1,instructor2,student1,student2};
        //And with for loop we can see user code's and firstname's.
        //With get method you can get usercode (usercode has no set method)
        for(User user:users){
            System.out.print(user.getUserCode());
            System.out.println( " + " + user.getFirstName());
        }

        System.out.println("-------------------------------------");//For better vision in console

        //All type user managers in this demo.We can see differences between managers in console.
        UserManager userManager = new UserManager();
        userManager.addToClass(instructor1,new FileLogger()); //We can see a logger type in this line.

        System.out.println("-------------------------------------");//for better vision in console

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addToClass(instructor2,new DatabaseLogger()); //We can see a logger type in this line.
        instructorManager.canOpenClass(instructor1);// Allow the instructor to open new class.

        System.out.println("-------------------------------------");//for better vision in console

        StudentManager studentManager = new StudentManager();
        studentManager.addToClass(student1);
        studentManager.getKicked(student2); //You can kick a student from class. That's awesome right :)))))


    }
}
