package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    SharedPreferences sp;
    Button about;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about = (Button) findViewById(R.id.about);
        start = (Button) findViewById(R.id.start);
        about.setOnClickListener(this);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v == about) {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
        }
        if(v == start) {
            Intent intent = new Intent(this, Question1.class);
            startActivity(intent);
        }
    }
}
