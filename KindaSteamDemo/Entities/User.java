package Entities;

import Abstract.IEntity;

public class User implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String birthYear;
    private String nationalID;
    private double balance;

    public User(){

    }
    public User(int id, String firstName , String lastName, String birthYear, String nationalID){
        this.id = id;
        this.firstName= firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nationalID = nationalID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
