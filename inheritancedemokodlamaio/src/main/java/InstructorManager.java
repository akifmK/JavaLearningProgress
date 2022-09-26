public class InstructorManager extends UserManager{


    public void addToClass(Instructor instructor,BaseLogger logger){
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+
                " hase been added to class as instructor");
        logger.log();
    }

    public void canOpenClass(Instructor instructor){
        System.out.println("instructor with code " + instructor.getUserCode() +" can open class now");
    }


}
