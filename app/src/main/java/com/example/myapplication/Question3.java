package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question3 extends AppCompatActivity implements View.OnClickListener {
    static int count = 0;
    TextView t1;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
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
        if (v == b2) {
            count = 5;
        }
        else {
            count = 0;
        }
        Intent intent = new Intent(this, Question4.class);
        startActivity(intent);
    }
    public static int getPoints() {
        return count + Question2.getPoints();
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuain,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);
        int id=item.getItemId();
        if(id==R.id.home){
            Toast.makeText(this,"you selected home",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else if(R.id.restart==id){
            Toast.makeText(this,"you selected restart",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Question1.class);
            startActivity(intent);
        }
        else if(id==R.id.Guide){
            Toast.makeText(this,"you selected guide",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
        }
        return true;
    }

}
