package com.example.tugas3pb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MotorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor);

        CardView cvSupra = findViewById(R.id.cvSupra);
        CardView cvBeat = findViewById(R.id.cvBeat);
        CardView cvVega = findViewById(R.id.cvVega);
        CardView cvNmax = findViewById(R.id.cvNmax);
        CardView cvCbr = findViewById(R.id.cvCbr);


        cvSupra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("SUPRA", "Rp19.100.000","MESIN : 125cc     TENAGA : 9,92hp        TORSI : 9,3nm", R.drawable.supra);

            }
        });

        cvBeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("BEAT", "Rp18.050.000","MESIN : 110cc     TENAGA : 8,89hp        TORSI : 9,3nm", R.drawable.beat);

            }
        });

        cvVega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("VEGA", "Rp18.175.000","MESIN : 113cc     TENAGA : 8,58hp        TORSI : 8,3nm", R.drawable.vega);

            }
        });

        cvNmax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("NMAX", "Rp31.925.000","MESIN : 155cc     TENAGA : 15hp        TORSI : 15nm", R.drawable.nmax);

            }
        });

        cvCbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("CBR", "Rp37.783.000","MESIN : 150cc    TENAGA : 16,8hp        TORSI : 13,7nm", R.drawable.cbr);

            }
        });
    }

    private void startDetailActivity(String NamaKendaraan, String HargaKendaraan, String DeskripsiKendaraan, int itemImageResId) {
        Intent intent = new Intent(MotorActivity.this, DetailActivity.class);
        intent.putExtra("NamaKendaraan", NamaKendaraan);
        intent.putExtra("HargaKendaraan", HargaKendaraan);
        intent.putExtra("DeskripsiKendaraan",DeskripsiKendaraan);
        intent.putExtra("itemImageResId", itemImageResId);
        startActivity(intent);
    }
}