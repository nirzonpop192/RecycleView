package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    List<String> country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            country.add("Bangladesh");
            country.add("India");
            country.add("Paksthan");
            country.add("Napel");
            country.add("Srilanka");
            country.add("Usa");
            country.add("UK");
            country.add("Afganishthan");
            country.add("Uganda");
            country.add("Canda");
            country.add("Austilia");
            country.add("Egept");
            country.add("China");
        }
        recyclerView = (RecyclerView) findViewById(R.id.rv);

        CountryAdpater adpater = new CountryAdpater(this, country);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //adapter = new MyRecyclerViewAdapter(this, animalNames);
        //adapter.setClickListener(this);
       // recyclerView.setAdapter(adapter);
        recyclerView.setAdapter(adpater);

    }
}
