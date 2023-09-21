package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;


public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Switch switchBlack = findViewById(R.id.switch1);
        Switch switchRed = findViewById(R.id.switch2);
        Switch switchGreen = findViewById(R.id.switch3);
        Switch switchYellow = findViewById(R.id.switch4);
        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.backgroundID);


        switchBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchBlack.isChecked()){
                    background.setBackgroundResource(R.color.black);
                } else {
                    background.setBackgroundResource(R.color.white);
                }

            }
        });
        switchRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchRed.isChecked()){
                    background.setBackgroundResource(R.color.red);
                } else {
                    background.setBackgroundResource(R.color.white);
                }

            }
        });
        switchGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchGreen.isChecked()){
                    background.setBackgroundResource(R.color.green);
                } else {
                    background.setBackgroundResource(R.color.white);
                }

            }
        });
        switchYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchYellow.isChecked()){
                    background.setBackgroundResource(R.color.yellow);
                } else {
                    background.setBackgroundResource(R.color.white);
                }

            }
        });


    }
}