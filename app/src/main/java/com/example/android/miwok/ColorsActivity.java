/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Color> colors=new ArrayList<Color>();

        colors.add(new Color("red","weṭeṭṭi",R.drawable.color_red));
        colors.add(new Color("green","chokokki",R.drawable.color_green));
        colors.add(new Color("brown","ṭakaakki",R.drawable.color_brown));
        colors.add(new Color("gray","ṭopoppi",R.drawable.color_gray));
        colors.add(new Color("black","kululli",R.drawable.color_black));
        colors.add(new Color("white","kelelli",R.drawable.color_white));
        colors.add(new Color("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colors.add(new Color("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        ColorAdapter adapter=new ColorAdapter(this,colors);
        ListView listView=(ListView)findViewById(R.id.color_list);
        listView.setAdapter(adapter);
    }
}
