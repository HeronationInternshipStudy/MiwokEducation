package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context, ArrayList<Phrase> phrases){
        super(context,0,phrases); //부모 클래스 ArrayAdaptet<phrase> 생성자
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.phrase_list,parent,false);
        }

        Phrase currentphrase=getItem(position);
        TextView miwok_text_view=(TextView)listItemView.findViewById(R.id.mPhrase_text_view);
        miwok_text_view.setText(currentphrase.getMiwok_phrase());
        TextView default_text_view=(TextView)listItemView.findViewById(R.id.dPhrase_text_view);
        default_text_view.setText(currentphrase.getEnglish_phrase());

        return listItemView;
    }
}
