package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId){
        super(context,0,words); //부모 클래스 ArrayAdaptet<Word> 생성자
        this.colorResourceId=colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.word_list,parent,false);
        }

        Word currentWord=getItem(position);
        TextView miwok_text_view=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwok_text_view.setText(currentWord.getMiwok_word());
        TextView default_text_view=(TextView)listItemView.findViewById(R.id.default_text_view);
        default_text_view.setText(currentWord.getEnglish_word());
        ImageView word_image_view=(ImageView)listItemView.findViewById(R.id.word_image_view);
        if(currentWord.hasImage()) {
            word_image_view.setImageResource(currentWord.getWord_resource_id());
            word_image_view.setVisibility(View.VISIBLE);
        }else{
            word_image_view.setVisibility(View.GONE);
        }

        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),colorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
