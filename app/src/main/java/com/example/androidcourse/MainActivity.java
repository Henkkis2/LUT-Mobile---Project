package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button randomButton = (Button) findViewById(R.id.randomButton);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRandom();
            }
        });

        calculator = (Button) findViewById(R.id.buttonToCalculator);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalc();
            }
        });

        Button XMLView = (Button) findViewById(R.id.buttonToXML);
        XMLView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openXMLV();
            }
        });

        Button settings = (Button) findViewById(R.id.SettingButton);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettings();
            }
        });

        Button googleButton = (Button) findViewById(R.id.toTheInternet);
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.google.fi";
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }
            }
        });

    }


    public void openXMLV() {
        Intent intent = new Intent(this, XMLView.class);
        startActivity(intent);
    }
    public void openSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void openCalc() {
        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }
    public void openRandom() {
        Intent intent = new Intent(this, RandomAct.class);
        startActivity(intent);
    }
}