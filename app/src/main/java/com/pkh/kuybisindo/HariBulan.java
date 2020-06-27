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

public class HariBulan extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videolist;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari_bulan);

        videoView = findViewById(R.id.videoView);
        listView = findViewById(R.id.listView);

        videolist = new ArrayList<>();
        videolist.add("Senin");
        videolist.add("Selasa");
        videolist.add("Rabu");
        videolist.add("Kamis");
        videolist.add("Jumat");
        videolist.add("Sabtu");
        videolist.add("Minggu");
        videolist.add("Besok");
        videolist.add("Lusa");
        videolist.add("Kemarin");
        videolist.add("Hari Ini");
        videolist.add("Minggu Lalu");
        videolist.add("Minggu Depan");
        videolist.add("Januari");
        videolist.add("Februari");
        videolist.add("Maret");
        videolist.add("April");
        videolist.add("Mei");
        videolist.add("Juli");
        videolist.add("Agustus");
        videolist.add("September");
        videolist.add("Oktober");
        videolist.add("November");
        videolist.add("Desember");


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videolist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.senin));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.selasa));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabu));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kamis));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.jumat));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sabtu));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.minggu));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.besok));
                        break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lusa));
                        break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kemarin));
                        break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hari_ini));
                        break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.minggu_lalu));
                        break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.minggu_depan));
                        break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.januari));
                        break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.februari));
                        break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.maret));
                        break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.april));
                        break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mei));
                        break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.juli));
                        break;
                    case 19:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.agustus));
                        break;
                    case 20:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.september));
                        break;
                    case 21:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.oktober));
                        break;
                    case 22:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.november));
                        break;
                    case 23:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.desember));
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
