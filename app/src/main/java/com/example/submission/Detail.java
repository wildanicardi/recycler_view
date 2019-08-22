package com.example.submission;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    TextView profil,desc;
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Halaman Detail");

        profil = findViewById(R.id.namaprofil);
        desc = findViewById(R.id.desc);
        gambar = findViewById(R.id.gambar);

        Intent intent = getIntent();

        String images = intent.getStringExtra("GAMBAR");
        String name = intent.getStringExtra("NAMA");
        String username = intent.getStringExtra("DESC");


        profil.setText(name);
        desc.setText(username);
        Glide.with(this)
                .load(images)
                .into(gambar);
    }
}
