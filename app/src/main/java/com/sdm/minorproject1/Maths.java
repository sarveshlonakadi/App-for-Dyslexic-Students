package com.sdm.minorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Maths extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        VideoView videoView = (VideoView) findViewById(R.id.video_view);  //casting to VideoView is not Strictly required above API level 26
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.maths;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Button nextpg= findViewById(R.id.button3);
        nextpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentex1;
                intentex1=new Intent(Maths.this,Maths2.class);
                startActivity(intentex1);
            }
        });


    }
}