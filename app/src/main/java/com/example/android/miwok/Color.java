package com.example.android.miwok;

public class Color {
    private String miwok_color;
    private String english_color;
    private int color_resource_id;

    public Color(String miwok_color,String english_color){
        this.miwok_color=miwok_color;
        this.english_color=english_color;
    }

    public Color(String miwok_color,String english_color,int color_resource_id){
        this.miwok_color=miwok_color;
        this.english_color=english_color;
        this.color_resource_id=color_resource_id;
    }

    public String getEnglish_color() {
        return english_color;
    }

    public String getMiwok_color() {
        return miwok_color;
    }

    public int getColor_resource_id() {
        return color_resource_id;
    }

    public void setColor_resource_id(int color_resource_id) {
        this.color_resource_id = color_resource_id;
    }

    public void setEnglish_color(String english_color) {
        this.english_color = english_color;
    }

    public void setMiwok_color(String miwok_color) {
        this.miwok_color = miwok_color;
    }
}
