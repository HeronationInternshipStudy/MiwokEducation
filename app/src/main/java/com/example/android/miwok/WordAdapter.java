package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words); //부모 클래스 ArrayAdaptet<Word> 생성자
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord=getItem(position);
        TextView miwok_text_view=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwok_text_view.setText(currentWord.getMiwok_word());
        TextView default_text_view=(TextView)listItemView.findViewById(R.id.default_text_view);
        default_text_view.setText(currentWord.getEnglish_word());

        return listItemView;
    }
}
