package com.example.cspeir.collegeapp;

@SuppressWarnings("deprecation")
public abstract class ApplicantData {
    private String email;
    private String objectId;
    private String mObjectId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        mObjectId = objectId;
    }
}
