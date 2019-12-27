package com.example.android.miwok;

public class Word {

    private String miwok_word;
    private String english_word;
    private int word_resource_id=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String miwok_word,String english_word){
        this.miwok_word=miwok_word;
        this.english_word=english_word;
    }

    public Word(String miwok_word,String english_word,int word_resource_id){
        this.miwok_word=miwok_word;
        this.english_word=english_word;
        this.word_resource_id=word_resource_id;
    }

    public String getEnglish_word() {
        return english_word;
    }

    public String getMiwok_word() {
        return miwok_word;
    }

    public int getWord_resource_id() {return word_resource_id;}

    public void setEnglish_word(String english_word) {
        this.english_word = english_word;
    }

    public void setMiwok_word(String miwok_word) {
        this.miwok_word = miwok_word;
    }

    public void setWord_resource_id(int word_resource_id){this.word_resource_id=word_resource_id;}
    public boolean hasImage(){
        return word_resource_id!=NO_IMAGE_PROVIDED;
    }
}
