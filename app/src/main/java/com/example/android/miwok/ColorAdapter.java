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


    public class ColorAdapter extends ArrayAdapter<Color> {

        public ColorAdapter(Activity context, ArrayList<Color> colors){
            super(context,0,colors); //부모 클래스 ArrayAdaptet<color> 생성자
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItemView=convertView;
            if(listItemView==null){
                listItemView= LayoutInflater.from(getContext()).inflate(R.layout.color_list,parent,false);
            }

            Color currentcolor=getItem(position);
            TextView miwok_text_view=(TextView)listItemView.findViewById(R.id.mColor_text_view);
            miwok_text_view.setText(currentcolor.getMiwok_color());
            TextView default_text_view=(TextView)listItemView.findViewById(R.id.dColor_text_view);
            default_text_view.setText(currentcolor.getEnglish_color());
            ImageView color_image_view=(ImageView)listItemView.findViewById(R.id.color_image_view);
            color_image_view.setImageResource(currentcolor.getColor_resource_id());

            return listItemView;
        }
    }

