package com.example.android.miwok;

public class Family {
    private String miwok_family;
    private String english_family;

    public Family(String miwok_family,String english_family){
        this.miwok_family=miwok_family;
        this.english_family=english_family;
    }

    public String getEnglish_family() {
        return english_family;
    }

    public String getMiwok_family() {
        return miwok_family;
    }

    public void setEnglish_family(String english_family) {
        this.english_family = english_family;
    }

    public void setMiwok_family(String miwok_family) {
        this.miwok_family = miwok_family;
    }
}
