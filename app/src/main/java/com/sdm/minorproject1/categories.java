package com.sdm.minorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories2);

        ImageButton imgb1eng=findViewById(R.id.englishimg);
        ImageButton imgb1movie=findViewById(R.id.movieimg);
        ImageButton imgb1reading=findViewById(R.id.readingimg);
        ImageButton imgb1wordg=findViewById(R.id.gamesimg);
        ImageButton imgb1maths=findViewById(R.id.mathsimg);
        ImageButton imgb1tests=findViewById(R.id.testsimg);


        imgb1eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1;
                intent1=new Intent(categories.this,english_abc_1.class);
                startActivity(intent1);
            }
        });
        imgb1movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2;
                intent2=new Intent(categories.this,Movie.class);
                startActivity(intent2);
            }
        });
        imgb1maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUD;
                intentUD=new Intent(categories.this,Maths.class);
                startActivity(intentUD);
            }
        });

        imgb1tests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUD;
                intentUD=new Intent(categories.this,Tests.class);
                startActivity(intentUD);
            }
        });
        imgb1wordg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUD;
                intentUD=new Intent(categories.this,UnderDev.class);
                startActivity(intentUD);
            }
        });
        imgb1reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentUD;
                intentUD=new Intent(categories.this,Maths2.class);
                startActivity(intentUD);
            }
        });

    }

}