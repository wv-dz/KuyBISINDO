package com.pkh.kuybisindo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView video, game;
    Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video = findViewById(R.id.button_video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openvideo();
            }
        });

        game = findViewById(R.id.button_game);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengame();
            }
        });

        about = findViewById(R.id.button_about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openabout();
            }
        });
    }

    public void openvideo() {
        Intent video = new Intent(this, video.class);
        startActivity(video);
    }

    public void opengame() {
        Intent game = new Intent(this, game.class);
        startActivity(game);
    }

    public void openabout() {
        Intent about = new Intent(this, about.class);
        startActivity(about);
    }
}