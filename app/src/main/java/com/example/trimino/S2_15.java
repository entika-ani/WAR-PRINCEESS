package com.example.trimino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class S2_15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s215);
    }
    public void back(View v){
        Intent intent = new Intent(this, Stories.class);
        startActivity(intent);
        finish();
    }
    public void araj(View v){
        Intent intent = new Intent(this,Stories.class);
        startActivity(intent);
        finish();
    }

    public void  mi_hatHet(View v){
        Intent intent = new Intent(this,S2_14.class);
        startActivity(intent);
        finish();
    }
}