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

public class buah extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videolist;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

        videoView = findViewById(R.id.videoView);
        listView = findViewById(R.id.listView);

        videolist = new ArrayList<>();
        videolist.add("Apel");
        videolist.add("Anggur");
        videolist.add("Jeruk");
        videolist.add("Pepaya");
        videolist.add("Pisang");
        videolist.add("Semangka");
        videolist.add("Manggis");
        videolist.add("Alpukat");
        videolist.add("Nanas");
        videolist.add("Mangga");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videolist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.apel));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.anggur));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.jeruk));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pepaya));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pisang));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.semangka));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.manggis));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.alpukat));
                        break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nanas));
                        break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mangga));
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
