package com.example.cspeir.collegeapp;


import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class Family {
    private final static String TAG = Family.class.getName();
    private ArrayList <FamilyMember> mFamily;
    private static Family sFamily;


    public Family(){
        mFamily = new ArrayList<>();
        Guardian mom = new Guardian("my", "mother");
        Guardian dad = new Guardian();
        Guardian sibling = new Guardian();

        mFamily.add(mom);
        mFamily.add(dad);
        mFamily.add(sibling);
    }

    public static Family get(){
        if (sFamily == null);
        {
            sFamily = new Family();
        }
        return sFamily;
    }

    public ArrayList<FamilyMember>getFamily(){
        return mFamily;
    }

    private Family(ArrayList<FamilyMember>FamilyList){
        mFamily = FamilyList;
    }
}
