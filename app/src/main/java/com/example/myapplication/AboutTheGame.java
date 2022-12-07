package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutTheGame extends AppCompatActivity implements
        View.OnClickListener {
    Button ret;
    TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_the_game);
         ret = (Button) findViewById(R.id.ret);
         details = (TextView) findViewById(R.id.details);
        ret.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == ret) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}