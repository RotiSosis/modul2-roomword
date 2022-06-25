package com.example.roomworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;

import com.example.roomworld.DATA.Kata;
import com.example.roomworld.DATA.KataDatabase;
import com.example.roomworld.DATA.Pustaka;
import com.example.roomworld.DATA.PustakaDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    AdapterData adapterData;
    List<String> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PustakaDatabase db1 = Room.databaseBuilder(getApplicationContext(),
                PustakaDatabase.class, "pustaka_database").allowMainThreadQueries().build();

        KataDatabase db2 = Room.databaseBuilder(getApplicationContext(),
                KataDatabase.class, "kata_database").allowMainThreadQueries().build();

        Pustaka pustaka1 = new Pustaka("Smithereens A");
        Pustaka pustaka2 = new Pustaka("Smithereens B");
        Pustaka pustaka3 = new Pustaka("Smithereens c");
        Pustaka pustaka4 = new Pustaka("Smithereens D");
        Pustaka pustaka5 = new Pustaka("Smithereens E");
        Pustaka pustaka6 = new Pustaka("Smithereens F");
        Pustaka pustaka7 = new Pustaka("Smithereens G");
        Pustaka pustaka8 = new Pustaka("Smithereens H");
        Pustaka pustaka9 = new Pustaka("Smithereens I");
        Pustaka pustaka10 = new Pustaka("Smithereens J");

        Kata kata1 = new Kata("Dance A");
        Kata kata2 = new Kata("Dance B");

        db1.pustakaDao().insertAll(pustaka1, pustaka2, pustaka3, pustaka4, pustaka5, pustaka6, pustaka7, pustaka8, pustaka9, pustaka10);
        db2.KataDao().insertAll(kata1, kata2);

        List<Pustaka> pustakaList = db1.pustakaDao().getAllPustaka();
        List<Kata> kataList = db2.KataDao().getAllKata();

        recyclerView = findViewById(R.id.rv_pustaka);
        listData = new ArrayList<>();

        for(int i=0;i<3;i++){
            listData.add("Data Ke "+ i);
        }

        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapterData = new AdapterData(this, listData, pustakaList);
        recyclerView.setAdapter(adapterData);
        adapterData.notifyDataSetChanged();
    }
}