package com.example.listviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button viewHolderBTN;
    Button notViewHolderBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewHolderBTN = (Button) findViewById(R.id.btn_list_VH);
        notViewHolderBTN = (Button) findViewById(R.id.btn_list_NVH);
    }

    public void openListViewHolder(View view) {
        Intent intent = new Intent(MainActivity.this, ViewHolderActivity.class);
        startActivity(intent);
    }

    public void openListNotViewHolder(View view) {
        Intent intent = new Intent(MainActivity.this, NotViewHolderActivity.class);
        startActivity(intent);
    }
}
