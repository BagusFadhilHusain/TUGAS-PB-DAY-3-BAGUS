package com.example.tugas3pb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MobilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);

        CardView cvAlphard = findViewById(R.id.cvAlphard);
        CardView cvAvanza = findViewById(R.id.cvAvanza);
        CardView cvCrv = findViewById(R.id.cvCrv);
        CardView cvFortuner = findViewById(R.id.cvFortuner);
        CardView cvSupramobil = findViewById(R.id.cvSupramobil);


        cvAlphard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("ALPHARD", "Rp1.369.000.000", "MESIN : 2498cc    TENAGA : 180hp        TORSI : 235nm", R.drawable.alphard);
            }
        });

        cvAvanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("AVANZA", "Rp237.000.000", "MESIN : 1993cc    TENAGA : 145hp        TORSI : 181nm", R.drawable.avanza);

            }
        });

        cvCrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("CRV", "Rp749.000.000", "MESIN : 2498cc    TENAGA : 180hp        TORSI : 235nm", R.drawable.crv);

            }
        });

        cvFortuner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("FORTUNER", "Rp564.000.000","MESIN : 2393cc    TENAGA : 148hp        TORSI : 400nm", R.drawable.fortuner);

            }
        });

        cvSupramobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("SUPRA", "Rp2.238.000.000","MESIN : 2498cc    TENAGA : 180hp        TORSI : 235nm", R.drawable.supramobil);

            }
        });
    }

    private void startDetailActivity(String NamaKendaraan, String HargaKendaraan, String DeskripsiKendaraan, int itemImageResId) {
        Intent intent = new Intent(MobilActivity.this, DetailActivity.class);
        intent.putExtra("NamaKendaraan", NamaKendaraan);
        intent.putExtra("HargaKendaraan", HargaKendaraan);
        intent.putExtra("DeskripsiKendaraan",DeskripsiKendaraan);
        intent.putExtra("itemImageResId", itemImageResId);
        startActivity(intent);
    }
}