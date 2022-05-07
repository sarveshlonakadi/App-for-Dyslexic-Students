package com.sdm.minorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rhymes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);

        Button plays=findViewById(R.id.play);
        Button stops=findViewById(R.id.stop);
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.dong);
        Button next=findViewById(R.id.next);


        plays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        stops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });
        stops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2;
                intent2=new Intent(Rhymes.this,English.class);
                startActivity(intent2);
            }
        });

    }
}