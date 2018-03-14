package com.basic.nanodegree.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
    }
    public void playListClick(View view) {
        Toast.makeText(PlayList.this,"PlayList Click",Toast.LENGTH_LONG).show();
    }
}
