package com.example.cspeir.collegeapp;


import android.widget.CompoundButton;

import java.security.Guard;

@SuppressWarnings("deprecation")
public class Guardian extends FamilyMember {
    private String occupation;

    public Guardian(String first, String last) {
        super(first, last);
        occupation = "unknown";
    }

    public String getOccupation() {
        return occupation;
    }

    public Guardian(String first, String last, String occupation) {
        super(first, last);
        this.occupation = occupation;

    }


    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Guardian() {
        super();
        occupation = "unknown";
    }

    @Override
    public String toString() {
        return "Guardian" + getFirstName() + "" + getLastName() + "" + "\nOccupation" + occupation;



    }



}

