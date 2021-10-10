package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Button and EditText objects declaration..
Button btn;
EditText ed1name,ed2pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //linking the ui objects...
        btn = findViewById(R.id.loginBtn);
        ed1name = findViewById(R.id.inpUsername);
        ed2pass = findViewById(R.id.inpPassword);
        //Button click event...
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reading the user inputs and store in a String...
                String username = ed1name.getText().toString().trim();
                String password = ed2pass.getText().toString().trim();
                //condition check...
                if (username.equals("Admin") && password.equals("password")){
                    //Intent for switching activity...
                    Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                    intent.putExtra("User",username);
                    startActivity(intent);
                } else {
                    //Notification for wrong inputs...
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_LONG).show();
                    //resetting the userinput field...
                    ed1name.setText("");
                    ed2pass.setText("");
                }
            }
        });
    }
}