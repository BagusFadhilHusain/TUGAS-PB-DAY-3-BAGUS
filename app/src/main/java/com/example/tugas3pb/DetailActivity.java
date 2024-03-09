package com.example.tugas3pb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String NamaKendaraan = intent.getStringExtra("NamaKendaraan");
        String DeskripsiKendaraan = intent.getStringExtra("DeskripsiKendaraan");
        String HargaKendaraan = intent.getStringExtra("HargaKendaraan");
        int itemImageResId = intent.getIntExtra("itemImageResId", R.drawable.sepeda);

        TextView tvNamaKendaraan = findViewById(R.id.tvNamaKendaraan);
        tvNamaKendaraan.setText(NamaKendaraan);

        TextView tvDeskripsiKendaraan = findViewById(R.id.tvDeskripsiKendaraan);
        tvDeskripsiKendaraan.setText(DeskripsiKendaraan);

        TextView tvHargaKendaraan = findViewById(R.id.tvHargaKendaraan);
        tvHargaKendaraan.setText(HargaKendaraan);

        ImageView ivKendaraan = findViewById(R.id.ivKendaraan);
        ivKendaraan.setImageResource(itemImageResId);



        Button btnShare = findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareDesc(NamaKendaraan, HargaKendaraan, DeskripsiKendaraan, itemImageResId);

            }
        });
    }

    private void shareDesc(String NamaKendaraan, String HargaKendaraan, String DeskripsiKendaraan, int itemImageResId) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), itemImageResId);
        Uri imageUri = getBitmapUri(bitmap);
        String shareText = "DAPATKAN KENDARAAN IMPIANMU SEGERA!!\n" + NamaKendaraan  + "\nDeskripsi\n" + DeskripsiKendaraan  + "\nHarga: " + HargaKendaraan;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(shareIntent, "Share Item via"));
    }

    private Uri getBitmapUri(Bitmap bitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Item Image", null);
        return Uri.parse(path);

    }
}