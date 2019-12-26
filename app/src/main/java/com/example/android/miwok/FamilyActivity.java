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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Family> familys=new ArrayList<Family>();

        familys.add(new Family("father","әpә"));
        familys.add(new Family("mother","әṭa"));
        familys.add(new Family("son","angsi"));
        familys.add(new Family("daughter","tune"));
        familys.add(new Family("older brother","taachi"));
        familys.add(new Family("younger brother","chalitti"));
        familys.add(new Family("older sister","teṭe"));
        familys.add(new Family("younger sister","kolliti"));
        familys.add(new Family("grandmother","ama"));
        familys.add(new Family("grandfather","paapa"));


        FamilyAdapter adapter=new FamilyAdapter(this,familys);
        ListView listView=(ListView)findViewById(R.id.family_list);
        listView.setAdapter(adapter);
    }
}
