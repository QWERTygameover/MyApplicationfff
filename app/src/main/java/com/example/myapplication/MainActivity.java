package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(){
        startActivity(new Intent(MainActivity.this, menu.class));
    }
    public void Registration(){
        startActivity(new Intent(MainActivity.this, registration.class));
    }
}