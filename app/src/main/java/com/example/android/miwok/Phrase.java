package com.example.android.miwok;

public class Phrase {
    private String miwok_phrase;
    private String english_phrase;

    public Phrase(String miwok_phrase,String english_phrase){
        this.miwok_phrase=miwok_phrase;
        this.english_phrase=english_phrase;
    }


    public String getEnglish_phrase() {
        return english_phrase;
    }

    public String getMiwok_phrase() {
        return miwok_phrase;
    }


    public void setEnglish_phrase(String english_phrase) {
        this.english_phrase = english_phrase;
    }

    public void setMiwok_phrase(String miwok_phrase) {
        this.miwok_phrase = miwok_phrase;
    }


}
