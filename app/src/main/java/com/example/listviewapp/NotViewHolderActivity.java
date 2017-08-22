package com.example.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NotViewHolderActivity extends AppCompatActivity {

    private ListView itemLV;
    private ArrayList<String> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_view_holder);

        itemLV = (ListView) findViewById(R.id.lv_noViewHolder);
        itemList = new ArrayList();
        populateList();

        ListAdapter adapter = new ArrayAdapter< String >(
                NotViewHolderActivity.this,
                R.layout.item_not_view_holder,
                itemList);

        itemLV.setAdapter(adapter);

    }

    public void populateList(){
        for(int i = 0; i < 5000; i ++ ) {
            itemList.add(" -- Item # --> " + (i + 1));
        }
    }
}
