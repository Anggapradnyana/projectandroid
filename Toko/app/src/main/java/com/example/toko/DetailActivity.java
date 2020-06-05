package com.example.toko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String nama="nama";
    public static final String harga="harga";
    public static final String keterngan="keterangan";
    public static final String gambar="NULL";
    public ImageView imdata;
    public TextView tvhargadata;
    public TextView tvnamadata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );

        tvnamadata= findViewById( R.id.tv_nama );
        tvhargadata = findViewById( R.id.tv_harga );
        imdata = findViewById( R.id.img_menu );

        String simpanama = getIntent().getStringExtra(nama);
        String simpanharga = getIntent().getStringExtra(harga);
        String simpanketarangan = getIntent().getStringExtra(keterngan);
        String simpangambar = getIntent().getStringExtra(gambar);

        tvnamadata.setText(simpanama);
        tvhargadata.setText(simpanharga);
        Glide
                .with(this)
                .load(simpangambar)
                .centerCrop()
                .into(imdata);
    }
}
