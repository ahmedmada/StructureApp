package com.basic.nanodegree.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
    }

    public void forward(View view) {
        Toast.makeText(Player.this,"forward",Toast.LENGTH_LONG).show();
    }
    public void stop(View view) {
        Toast.makeText(Player.this,"stop",Toast.LENGTH_LONG).show();
    }
    public void play(View view) {
        Toast.makeText(Player.this,"play",Toast.LENGTH_LONG).show();
    }
    public void pause(View view) {
        Toast.makeText(Player.this,"pause",Toast.LENGTH_LONG).show();
    }
    public void rewind(View view) {
        Toast.makeText(Player.this,"rewind",Toast.LENGTH_LONG).show();
    }

}
