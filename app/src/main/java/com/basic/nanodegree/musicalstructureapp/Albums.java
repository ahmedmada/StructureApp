package com.basic.nanodegree.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
    }
    public void albumClick(View view) {
        Toast.makeText(Albums.this,"Album Click",Toast.LENGTH_LONG).show();
    }

}
