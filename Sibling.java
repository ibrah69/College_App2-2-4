package com.example.cspeir.collegeapp;



@SuppressWarnings("deprecation")
public class Sibling  extends FamilyMember {


    public Sibling(String first, String last) {
        super(first, last);

    }

    @Override
    public String toString() {
        return "Sibling" + getFirstName() + "" + getLastName();



    }



}



