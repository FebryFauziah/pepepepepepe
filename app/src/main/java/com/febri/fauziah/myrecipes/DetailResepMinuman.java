package com.febri.fauziah.myrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepMinuman extends AppCompatActivity {

    ImageView imMinuman;
    TextView resepMinuman;
    int teksResep1, posisi1;
    String judulMinuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep_minuman);

        imMinuman = (ImageView) findViewById(R.id.imageView1);
        resepMinuman = (TextView) findViewById(R.id.textView1);
        AdapterMinuman adapterMinuman = new AdapterMinuman(this);

        Intent i = getIntent();
        posisi1 = i.getIntExtra("posisi", 0);

        switch (posisi1){
            case 0 : judulMinuman = "Wedang Bajigur";teksResep1 = R.string.esbuah;break;
            case 1 : judulMinuman = "Es Buah Segar";teksResep1 = R.string.bajigur;break;
        }
        getSupportActionBar().setTitle(judulMinuman);
        imMinuman.setImageResource(adapterMinuman.minuman[posisi1]);
        resepMinuman.setText(teksResep1);

    }
}
