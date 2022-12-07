package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question4 extends AppCompatActivity implements View.OnClickListener {
    static int count = 0;
    TextView t1;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        t1 = (TextView) findViewById(R.id.tvqst1);
        b1 = (Button) findViewById(R.id.btnans1);
        b2 = (Button) findViewById(R.id.btnans2);
        b3 = (Button) findViewById(R.id.btnans3);
        b4 = (Button) findViewById(R.id.btnans4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == b1 || v == b3 || v == b2) {
            Intent intent = new Intent(this, Question2.class);
            startActivity(intent);
        }
        if (v == b4) {
            Intent intent = new Intent(this, Question2.class);
            count = 5;
            startActivity(intent);

        }
    }
    public static int getPoints() {
        return count + Question1.getPoints();
    }
}
