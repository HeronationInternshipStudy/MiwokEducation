package com.example.android.miwok;

public class Word {

    private String miwok_word;
    private String english_word;

    public Word(String miwok_word,String english_word){
        this.miwok_word=miwok_word;
        this.english_word=english_word;
    }

    public String getEnglish_word() {
        return english_word;
    }

    public String getMiwok_word() {
        return miwok_word;
    }

    public void setEnglish_word(String english_word) {
        this.english_word = english_word;
    }

    public void setMiwok_word(String miwok_word) {
        this.miwok_word = miwok_word;
    }
}
