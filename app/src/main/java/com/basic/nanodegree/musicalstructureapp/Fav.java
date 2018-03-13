package com.basic.nanodegree.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Fav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);
    }
    public void favSong(View view) {
        Toast.makeText(Fav.this,"Fav Song",Toast.LENGTH_LONG).show();
    }
}
