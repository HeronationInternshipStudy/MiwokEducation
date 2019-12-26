package com.example.android.miwok;

public class Color {
    private String miwok_color;
    private String english_color;

    public Color(String miwok_color,String english_color){
        this.miwok_color=miwok_color;
        this.english_color=english_color;
    }

    public String getEnglish_color() {
        return english_color;
    }

    public String getMiwok_color() {
        return miwok_color;
    }

    public void setEnglish_color(String english_color) {
        this.english_color = english_color;
    }

    public void setMiwok_color(String miwok_color) {
        this.miwok_color = miwok_color;
    }
}
