package com.sdm.minorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class english_abc_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_abc1);

        Button next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1;
                intent1=new Intent(english_abc_1.this,Rhymes.class);
                startActivity(intent1);
            }
        });
        VideoView videoView = (VideoView) findViewById(R.id.video_view);  //casting to VideoView is not Strictly required above API level 26
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.engabc;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}