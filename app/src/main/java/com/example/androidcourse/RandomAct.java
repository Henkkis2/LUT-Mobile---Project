package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;
import java.util.Random;


import java.util.ArrayList;

public class RandomAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);


        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Life is like riding a bicycle. To keep your balance, you must keep moving.");
        lista.add("May the Force be with you.");
        lista.add("No one can make you feel inferior without your consent.");
        lista.add("Not all those who wander are lost.");
        lista.add("All that glitters is not gold.");
        lista.add("Elementary, my dear Watson.");
        lista.add("Go ahead, make my day.");
        lista.add("If you are going through hell, keep going.");
        lista.add("Knowledge is power.");
        lista.add("Life is like a box of chocolates. You never know what you’re gonna get.");

       TextView textView = (TextView) findViewById(R.id.randomQuote);

        Random random = new Random();

        int x = random.nextInt(8);
        textView.setText(lista.get(x));

        Button newQuotee = (Button) findViewById(R.id.buttonNew);
        newQuotee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = random.nextInt(8);
                textView.setText(lista.get(x));
            }
        });


    }
}