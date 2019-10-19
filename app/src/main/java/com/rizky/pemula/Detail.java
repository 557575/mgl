package com.rizky.pemula;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends Activity {
    public static String EXTRA_PHOTO = "photo";
    public static String EXTRA_NAME = "nama";
    public static String EXTRA_DESC = "detail";

    TextView name, detail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Detail");

        imageView = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.nama_wisata);
        detail = findViewById(R.id.tv_item_detail);


        String nama = getIntent().getStringExtra(EXTRA_NAME);
        String desk = getIntent().getStringExtra(EXTRA_DESC);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);


        name.setText(nama);
        detail.setText(desk);
        Glide.with(this).load(photo).apply( new RequestOptions().override(200,300)).into(imageView);


    }

    private ActionBar getSupportActionBar() {
        return null;
    }

}
