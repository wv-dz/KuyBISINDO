package com.pkh.kuybisindo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class about extends AppCompatActivity {
    TextView text_desc, nama_anggota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        text_desc = findViewById(R.id.text_desc);
        text_desc.setText("Aplikasi ini dibuat untuk\nmemenuhi tugas akhir Mata Kuliah\nMedia Pembelajaran Adaptif.");

        nama_anggota = findViewById(R.id.nama_anggota);
        nama_anggota.setText("Fioni Duta Alfalah\t\t1102618023\nRita Marbun\t\t1102618077\nIntan Apriliyani Mentari\t\t1102618015\nAngre Claudia Nasution\t\t1102618017\nRia Kristanti\t\t1102618076");
    }
}
