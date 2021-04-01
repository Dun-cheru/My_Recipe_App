package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.widget.Button;

import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SignIn = (Button)findViewById(R.id.sign_in);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignIn = new Intent(MainActivity.this, HomePage.class);
                startActivity(SignIn);
            }
        });

        Button SignUp = (Button)findViewById(R.id.sign_up);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(MainActivity.this, Sign_Up.class);
                startActivity(SignUp);
            }
        });
    }
}