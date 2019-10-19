package com.rizky.pemula;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMagelang;
    private ArrayList<Magelang> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Wisata Magelang");

        rvMagelang = findViewById(R.id.rv_magelang);
        rvMagelang.setHasFixedSize(true);

        list.addAll(MagelangData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMagelang.setLayoutManager(new LinearLayoutManager(this));
        ListMagelangAdapter listMagelangAdapter = new ListMagelangAdapter(list);
        rvMagelang.setAdapter(listMagelangAdapter);

        listMagelangAdapter.setOnItemClickCallBack(new ListMagelangAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Magelang data) {
                showSelectedWisata(data);
            }
        });
}
    private void showSelectedWisata(Magelang data) {
        Intent intent = new Intent(MainActivity.this, Detail.class);
        intent.putExtra(Detail.EXTRA_PHOTO, data.getPhoto());
        intent.putExtra(Detail.EXTRA_NAME, data.getName());
        intent.putExtra(Detail.EXTRA_DESC, data.getDetail());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
