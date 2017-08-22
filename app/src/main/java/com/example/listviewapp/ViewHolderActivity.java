package com.example.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ViewHolderActivity extends AppCompatActivity {


    private List<String> itemList = new ArrayList<String>();
    private ListView itemLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_holder);
        itemLV = (ListView) findViewById(R.id.lv_viewHolder);

        populateList();

        MyAdapter adapter = new MyAdapter(ViewHolderActivity.this, R.layout.item_view_holder, itemList);
        itemLV.setAdapter(adapter);

    }

    public void populateList(){
        for(int i = 0; i < 5000; i ++ ) {
            itemList.add(" -- Item # --> " + (i + 1));
        }
    }

}
