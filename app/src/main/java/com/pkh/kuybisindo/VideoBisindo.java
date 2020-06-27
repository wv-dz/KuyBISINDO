package com.pkh.kuybisindo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VideoBisindo extends AppCompatActivity {
    ImageView abjad, buah, benda, sifat, percakapan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_bisindo);

        abjad = findViewById(R.id.button_abjad);
        abjad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openabjad();
            }
        });

        buah = findViewById(R.id.button_buah);
        buah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbuah();
            }
        });

        benda = findViewById(R.id.button_hari_bulan);
        benda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbenda();
            }
        });

        sifat = findViewById(R.id.button_kata_ganti_orang);
        sifat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensifat();
            }
        });

        percakapan = findViewById(R.id.button_percakapan);
        percakapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpercakapan();
            }
        });
    }

    public void openabjad() {
        Intent abjad = new Intent(this, abjad.class);
        startActivity(abjad);
    }

    public void openbuah() {
        Intent buah = new Intent(this, buah.class);
        startActivity(buah);
    }

    public void openbenda() {
        Intent benda = new Intent(this, HariBulan.class);
        startActivity(benda);
    }

    public void opensifat() {
        Intent sifat = new Intent(this, KataGantiOrang.class);
        startActivity(sifat);
    }

    public void openpercakapan() {
        Intent percakapan = new Intent(this, percakapan.class);
        startActivity(percakapan);
    }
}
