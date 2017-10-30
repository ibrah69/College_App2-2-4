package com.example.cspeir.collegeapp;


@SuppressWarnings("deprecation")
public abstract class FamilyMember extends ApplicantData{
    private String firstName;
    private String lastName;
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
    public FamilyMember(){
        firstName="Ted";
        lastName = "Voorstad";
    }
    public FamilyMember (String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

}
