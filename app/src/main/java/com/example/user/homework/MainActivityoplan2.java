package com.example.user.homework;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivityoplan2 extends Activity {

    ListView listView;
    String[] array2;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityoplan2);
        listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(MainActivityoplan2.this,android.R.layout.simple_list_item_1);

        Bundle bundle = getIntent().getExtras();
        array2 = bundle.getStringArray("array");
        for(int i=0;i<14;i++){
            if(array2[i].equals("")){}
            else
                adapter.add(array2[i]);
        }
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);
    }
}
