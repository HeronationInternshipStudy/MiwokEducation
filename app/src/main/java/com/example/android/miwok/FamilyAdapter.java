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

public class FamilyAdapter extends ArrayAdapter<Family> {

    public FamilyAdapter(Activity context, ArrayList<Family> familys){
        super(context,0,familys); //부모 클래스 ArrayAdaptet<family> 생성자
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.family_list,parent,false);
        }

        Family currentfamily=getItem(position);
        TextView miwok_text_view=(TextView)listItemView.findViewById(R.id.mFamily_text_view);
        miwok_text_view.setText(currentfamily.getMiwok_family());
        TextView default_text_view=(TextView)listItemView.findViewById(R.id.dFamily_text_view);
        default_text_view.setText(currentfamily.getEnglish_family());
        ImageView family_image_view=(ImageView)listItemView.findViewById(R.id.family_image_view);
        family_image_view.setImageResource(currentfamily.getFamily_resource_id());

        return listItemView;
    }

}