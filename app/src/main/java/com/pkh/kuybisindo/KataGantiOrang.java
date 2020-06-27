package com.pkh.kuybisindo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.VideoView;

import java.util.ArrayList;

public class KataGantiOrang extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videolist;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_ganti_orang);

        videoView = findViewById(R.id.videoView);
        listView = findViewById(R.id.listView);

        videolist = new ArrayList<>();
        videolist.add("Aku");
        videolist.add("Kamu");
        videolist.add("Dia");
        videolist.add("Kami");
        videolist.add("MEreka");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videolist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.aku));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kamu));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dia));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kami));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mereka));
                        break;
                    default:
                        break;
                }
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
