package com.example.tugas3pb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cvSepeda = findViewById(R.id.cvSepeda);
        CardView cvMotor = findViewById(R.id.cvMotor);
        CardView cvMobil = findViewById(R.id.cvMobil);

        cvSepeda.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SepedaActivity.class);
            startActivity(intent);
        });

        cvMotor.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MotorActivity.class);
            startActivity(intent);
        });

        cvMobil.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MobilActivity.class);
            startActivity(intent);
        });
    }
}