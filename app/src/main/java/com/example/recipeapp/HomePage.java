package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity implements View.OnClickListener{
    public CardView cardone, cardtwo, cardthree, cardfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
            cardone = findViewById(R.id.cardone);
            cardtwo = findViewById(R.id.cardtwo);
            cardthree = findViewById(R.id.cardthree);
            cardfour = findViewById(R.id.cardfour);

            cardone.setOnClickListener(this);
            cardtwo.setOnClickListener(this);
            cardthree.setOnClickListener(this);
            cardfour.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            Intent i;

            switch (v.getId()) {
                case R.id.cardone:
                    i = new Intent(this, Cake.class);
                    startActivity(i);
                    break;
                case R.id.cardtwo:
                    i = new Intent(this, Fries.class);
                    startActivity(i);
                    break;
                case R.id.cardthree:
                    i = new Intent(this, Rice.class);
                    startActivity(i);
                    break;
                case R.id.cardfour:
                    i = new Intent(this, Omllette.class);
                    startActivity(i);
                    break;
                default:
                    break;
            }
        }
    }
