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


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener completionListener=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Word> familys=new ArrayList<Word>();

        familys.add(new Word("father","әpә",R.drawable.family_father,R.raw.family_father));
        familys.add(new Word("mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        familys.add(new Word("son","angsi",R.drawable.family_son,R.raw.family_son));
        familys.add(new Word("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        familys.add(new Word("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        familys.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        familys.add(new Word("older sister","teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        familys.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        familys.add(new Word("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        familys.add(new Word("grandfather","paapa",R.drawable.family_grandfather,R.raw.family_father));


        WordAdapter adapter=new WordAdapter(this,familys,R.color.category_family);
        ListView listView=(ListView)findViewById(R.id.family_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word=familys.get(i);
                releaseMediaPlayer();
                mediaPlayer=MediaPlayer.create(FamilyActivity.this,word.getAudio_resource_id());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(completionListener);
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}
