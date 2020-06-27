package com.pkh.kuybisindo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class video extends AppCompatActivity {
    ImageView bisindo, cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        bisindo = findViewById(R.id.button_video_bisindo);
        bisindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbisindo();
            }
        });

        cover = findViewById(R.id.button_video_cover);
        cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencover();
            }
        });
    }

    public void openbisindo() {
        Intent bisindo = new Intent(this, VideoBisindo.class);
        startActivity(bisindo);
    }

    public void opencover() {
        Intent cover = new Intent(this, VideoCover.class);
        startActivity(cover);
    }
}
