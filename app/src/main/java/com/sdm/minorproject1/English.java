package com.sdm.minorproject1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Locale;


public class English extends AppCompatActivity {
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        Button b = findViewById(R.id.button);
        EditText et = findViewById(R.id.editTextTextPersonName);
        Button ret_to_cat=findViewById(R.id.returncat);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if(status == TextToSpeech.SUCCESS){
                            RadioGroup lang = findViewById(R.id.rg1);

                            int result = 0;
                            switch (lang.getCheckedRadioButtonId()){
                                case R.id.english:
                                    result = tts.setLanguage(Locale.ENGLISH);
                                    break;


                            }
                        }

                        tts.setPitch(1.0f);
                        tts.setSpeechRate(1);
                        tts.speak(et.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);


                    }
                });

                //String s = et.getText().toString().toLowerCase(Locale.ROOT);
            }
        });
        ret_to_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2;
                intent2=new Intent(English.this, categories.class);
                startActivity(intent2);
            }
        }
        );

    }
}