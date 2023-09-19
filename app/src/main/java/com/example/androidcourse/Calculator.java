package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    private Button backTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);
        backTo = (Button) findViewById(R.id.backToMainMenu);
        backTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToMain();
            }
        });
    }
    public void backToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Add(View view) {
        EditText input1 = (EditText) findViewById(R.id.InputONE);
        EditText input2 = (EditText) findViewById(R.id.inputTWO);
        TextView result = (TextView) findViewById(R.id.textView6);
        int number = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int number3 = (number + number2);
        result.setText("Result is: " + number3);
    }
    public void Deduct(View view) {
        EditText input1 = (EditText) findViewById(R.id.InputONE);
        EditText input2 = (EditText) findViewById(R.id.inputTWO);
        TextView result = (TextView) findViewById(R.id.textView6);
        int number = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int number3 = (number - number2);
        result.setText("Result is: " + number3);
    }
    public void Divide(View view) {
        EditText input1 = (EditText) findViewById(R.id.InputONE);
        EditText input2 = (EditText) findViewById(R.id.inputTWO);
        TextView result = (TextView) findViewById(R.id.textView6);
        int number = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int number3 = (number / number2);
        result.setText("Result is: " + number3);
    }
    public void Multiply(View view) {
        EditText input1 = (EditText) findViewById(R.id.InputONE);
        EditText input2 = (EditText) findViewById(R.id.inputTWO);
        TextView result = (TextView) findViewById(R.id.textView6);
        int number = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int number3 = (number * number2);
        result.setText("Result is: " + number3);
    }

}