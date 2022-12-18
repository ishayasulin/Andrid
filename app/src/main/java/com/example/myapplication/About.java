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

public class About extends AppCompatActivity implements
        View.OnClickListener {
    Button ret;
    TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
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