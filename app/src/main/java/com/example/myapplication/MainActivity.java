package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
