package com.example.submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBola;
    private ArrayList<Bola> list = new ArrayList<>();
    private String title = "Halaman Utama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(title);

        rvBola  = findViewById(R.id.rv_bola);
        rvBola.setHasFixedSize(true);

        list.addAll(BolaData.getListData());
        showRecycler();



    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showRecycler() {
        rvBola.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter = new CardViewAdapter(list);
        rvBola.setAdapter(cardViewAdapter);
    }
    private void showProfilku(){
        Intent intent = new Intent(this, Profile.class);
        this.startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.profileku:
                title = "Halaman About";
                showProfilku();
                break;
        }
    }

}
