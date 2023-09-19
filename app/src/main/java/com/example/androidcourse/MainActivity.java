package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = (Button) findViewById(R.id.buttonToCalculator);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalc();
            }
        });
    }

    public void openCalc() {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
}