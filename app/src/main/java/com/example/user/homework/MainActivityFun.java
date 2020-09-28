package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivityFun extends Activity {

    ListView mListView;
    SearchView mSearchView;
    FirebaseDatabase database;
    DatabaseReference ref;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Fun fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_2);

        mListView = findViewById(R.id.listView);
        mSearchView = findViewById(R.id.searchView);

        Intent mIntent2 = getIntent();

        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        fun = new Fun();
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Fun");
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.car_info,R.id.carinfo, list);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds: dataSnapshot.getChildren()) {
                    fun = ds.getValue(Fun.class);
                    list.add(fun.getN().toString() + "\n" + fun.getA().toString() + "\n" + fun.getP().toString());
                }
                mListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
/*
        //adapter = new ArrayAdapter<String>(this,R.layout.car_info,R.id.carinfo, list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.simple_list_item_1,
                android.R.id.text1);

        DatabaseReference reference_contacts = FirebaseDatabase.getInstance().getReference("Fun");
        reference_contacts.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                adapter.clear();
                for (DataSnapshot ds : dataSnapshot.getChildren() ){
                    adapter.add(ds.child("n").getValue().toString() + "\n" + ds.child("a").getValue().toString() + "\n" + ds.child("p").getValue().toString());
                }
                mListView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
*/
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF1.class);
                    startActivity(myIntent);
                }
                if (position==1) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF2.class);
                    startActivity(myIntent);
                }
                if (position==2) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF3.class);
                    startActivity(myIntent);
                }
                if (position==3) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF4.class);
                    startActivity(myIntent);
                }
                if (position==4) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF5.class);
                    startActivity(myIntent);
                }

                if (position==5) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF6.class);
                    startActivity(myIntent);
                }

                if (position==6) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF7.class);
                    startActivity(myIntent);
                }
                if (position==7) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF8.class);
                    startActivity(myIntent);
                }
                if (position==8) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF9.class);
                    startActivity(myIntent);
                }
                if (position==9) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF10.class);
                    startActivity(myIntent);
                }
                if (position==10) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF11.class);
                    startActivity(myIntent);
                }
                if (position==11) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF12.class);
                    startActivity(myIntent);
                }
                if (position==12) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF13.class);
                    startActivity(myIntent);
                }
                if (position==13) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF14.class);
                    startActivity(myIntent);
                }
                if (position==14) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF15.class);
                    startActivity(myIntent);
                }
                if (position==15) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF16.class);
                    startActivity(myIntent);
                }
                if (position==16) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF17.class);
                    startActivity(myIntent);
                }
                if (position==17) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF18.class);
                    startActivity(myIntent);
                }
                if (position==18) {
                    Intent myIntent = new Intent(MainActivityFun.this, MainActivityF19.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
