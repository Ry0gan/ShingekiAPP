package com.ryogan.shingekiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ryogan.shingekiapp.adapter.RecyclerAdapter;
import com.ryogan.shingekiapp.model.ItemList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvLista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initValues();
    }

    private void initViews(){
        rvLista = findViewById(R.id.rvVista);
    }

    private void initValues(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items);
        rvLista.setAdapter(adapter);
    }

    private List<ItemList> getItems(){
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList(getResources().getString(R.string.erenName), getResources().getString(R.string.erenDesc), R.drawable.eren));
        itemLists.add(new ItemList(getResources().getString(R.string.mikasaName), getResources().getString(R.string.mikasaDesc), R.drawable.mikasa));
        itemLists.add(new ItemList(getResources().getString(R.string.arminName), getResources().getString(R.string.arminDesc), R.drawable.armin));
        itemLists.add(new ItemList(getResources().getString(R.string.leviName), getResources().getString(R.string.leviDesc), R.drawable.levi));
        itemLists.add(new ItemList(getResources().getString(R.string.erwinName), getResources().getString(R.string.erwinDesc), R.drawable.erwin));
        return itemLists;
    }
}