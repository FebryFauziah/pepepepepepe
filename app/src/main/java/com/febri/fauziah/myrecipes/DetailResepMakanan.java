package com.febri.fauziah.myrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepMakanan extends AppCompatActivity {
    ImageView imMakanan;
    TextView resepMakanan;
    int teksResep, posisi;
    String judulMakanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep_makanan);

        imMakanan = (ImageView) findViewById(R.id.imageView);
        resepMakanan = (TextView) findViewById(R.id.textView);
        AdapterMasakan adapterMasakan = new AdapterMasakan(this);

        Intent i = getIntent();
        posisi = i.getIntExtra("posisi", 0);

        switch (posisi) {
            case 0:
                judulMakanan = "Nasi Goreng Seafood";
                teksResep = R.string.nasigoreng;
                break;
            case 1:
                judulMakanan = "Rendang Padang";
                teksResep = R.string.rendang;
                break;
            case 2:
                judulMakanan = "Mie Goreng Jawa";
                teksResep = R.string.mie;
                break;
            case 3:
                judulMakanan = "Sate Ayam";
                teksResep = R.string.sate;
                break;
        }
        getSupportActionBar().setTitle(judulMakanan);
        imMakanan.setImageResource(adapterMasakan.masakan[posisi]);
        resepMakanan.setText(teksResep);

    }
}

