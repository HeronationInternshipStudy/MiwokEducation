package com.example.android.miwok;

public class Family {
    private String miwok_family;
    private String english_family;
    private int family_resource_id;

    public Family(String miwok_family,String english_family){
        this.miwok_family=miwok_family;
        this.english_family=english_family;
    }

    public Family(String miwok_family,String english_family,int family_resource_id){
        this.miwok_family=miwok_family;
        this.english_family=english_family;
        this.family_resource_id=family_resource_id;
    }

    public String getEnglish_family() {
        return english_family;
    }

    public String getMiwok_family() {
        return miwok_family;
    }

    public int getFamily_resource_id() {
        return family_resource_id;
    }

    public void setFamily_resource_id(int family_resource_id) {
        this.family_resource_id = family_resource_id;
    }

    public void setEnglish_family(String english_family) {
        this.english_family = english_family;
    }

    public void setMiwok_family(String miwok_family) {
        this.miwok_family = miwok_family;
    }
}
