package com.example.user.homework;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    ListView mListView;
    EditText mEditText;
    ImageButton mImageButton;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;
    SQLitedb db = new SQLitedb(MainActivity4.this);

    private void listviewupdate() {
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(MainActivity4.this,R.layout.simple_list_item_1,db.select());
        mListView.setAdapter(listAdapter);
        mEditText.setText("\n" + "");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mListView = findViewById(R.id.listView);
        mEditText = findViewById(R.id.editText);
        mImageButton = findViewById(R.id.imageButton);

        db.curosr();
        listviewupdate();
        adapter = new ArrayAdapter<String>(this,R.layout.car_info,R.id.carinfo, arrayList);

        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insert(mEditText.getText().toString());
                listviewupdate();
            }
        });
    }
}
