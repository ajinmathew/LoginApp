package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView txtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent=getIntent();
        String userName = intent.getStringExtra("User");

        txtUser = findViewById(R.id.textHome);
        txtUser.setText(userName);
    }
}