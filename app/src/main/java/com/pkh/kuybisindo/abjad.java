package com.pkh.kuybisindo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class abjad extends AppCompatActivity {
    VideoView j, r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abjad);

        j = findViewById(R.id.j);
        r = findViewById(R.id.r);

        j.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.j));
        r.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.r));

        j.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                mp.setLooping(true);
            }
        });

        r.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                mp.setLooping(true);
            }
        });
    }
}
