package com.example.tugas3pb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SepedaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepeda);

        CardView cvWimcycle = findViewById(R.id.cvWimcycle);
        CardView cvUnited = findViewById(R.id.cvUnited);
        CardView cvTrek = findViewById(R.id.cvTrek);
        CardView cvSpecialized = findViewById(R.id.cvSpecialized);
        CardView cvPolygon = findViewById(R.id.cvPolygon);


        cvWimcycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("WIMCYCLE", "Rp1.700.000", "FRAME : HI-TEN STEEL    WHEEL SIZE : 27,5        COLORS : GREEN", R.drawable.wimcycle);

            }
        });

        cvUnited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("UNITED", "Rp7.550.000","FRAME : ALLOY       WHEEL SIZE : 27,5        COLORS : RED BLCKWHTE", R.drawable.united);

            }
        });

        cvTrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("TREK", "Rp36.000.000", "FRAME : LW ALUMINIUM    WHEEL SIZE : 27,5        COLOUR : BLACK", R.drawable.trek);

            }
        });

        cvSpecialized.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("SPECIALIZED", "Rp11.500.000","FRAME : LC008    WHEEL SIZE : 27        COLOUR : SKY BLUE", R.drawable.specialized);

            }
        });

        cvPolygon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("POLYGON", "Rp4.300.000","FRAME : ALUTECH XC SPORT    WHEEL SIZE : 27,5        COLOUR : GREY", R.drawable.polygon);

            }
        });
    }

    private void startDetailActivity(String NamaKendaraan, String HargaKendaraan, String DeskripsiKendaraan, int itemImageResId) {
        Intent intent = new Intent(SepedaActivity.this, DetailActivity.class);
        intent.putExtra("NamaKendaraan", NamaKendaraan);
        intent.putExtra("HargaKendaraan", HargaKendaraan);
        intent.putExtra("DeskripsiKendaraan",DeskripsiKendaraan);
        intent.putExtra("itemImageResId", itemImageResId);
        startActivity(intent);
    }
}