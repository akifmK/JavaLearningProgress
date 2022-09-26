public class Instructor extends User {
    private String licence;

    public  Instructor(){

    }

    public Instructor(int id, String firstName, String lastName , String licence){

        this.licence=licence;
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);


    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
