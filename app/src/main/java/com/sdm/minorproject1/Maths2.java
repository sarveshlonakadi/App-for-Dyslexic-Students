package com.sdm.minorproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Maths2 extends AppCompatActivity {

    EditText no1 , no2;
    Button add , sub,equal;
    TextView answer;
    double ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths2);



        // for text views
        no1 = findViewById(R.id.first_no);
        no2 = findViewById(R.id.second_no);

        // for button with operations
        add = findViewById(R.id.add);

        sub = findViewById(R.id.sub);

        // for equal to button
        equal = findViewById(R.id.equals);

        // for answer field
        answer = findViewById(R.id.answer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = no1.getText().toString();
                String num2 = no2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(no1.getText().toString());
                    double b = Double.parseDouble(no2.getText().toString());
                    ans = a + b;
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = no1.getText().toString();
                String num2 = no2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(no1.getText().toString());
                    double b = Double.parseDouble(no2.getText().toString());
                    ans = a - b;
                }
            }
        });




        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1 = String.valueOf(ans);
                answer.setText(ans1);
                ans= 0;
            }
        });

    }
}