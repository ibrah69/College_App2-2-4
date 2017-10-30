package com.example.cspeir.collegeapp;

import java.util.Date;


@SuppressWarnings("deprecation")
public class Profile extends ApplicantData{
    private String lastName;
    private String firstName;
    private Date mDates;
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

    public Profile(){
        firstName = "Cnr";
        lastName = "Spr";
        mDates = new Date();

    }
    public Profile (String first, String last){
        this.firstName = first;
        this.lastName = last;
        mDates = new Date();
    }

    public Date getDates() {
        return mDates;
    }

    public void setDates(Date todaysDate) {
        mDates = todaysDate;
    }



}
