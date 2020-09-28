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

public class MainActivityFood extends Activity {

    ListView mListView;
    SearchView mSearchView;
    FirebaseDatabase database;
    DatabaseReference ref;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Food food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_3);
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
        food = new Food();
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("nFood");
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.car_info,R.id.carinfo, list);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds: dataSnapshot.getChildren()) {
                    food = ds.getValue(Food.class);
                    list.add(food.getN().toString() + "\n" + food.getA().toString() + "\n" + food.getP().toString());
                }
                mListView.setAdapter(adapter);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood1.class);
                    startActivity(myIntent);
                }
                 if (position==1) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood2.class);
                    startActivity(myIntent);
                }
                if (position==2) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood3.class);
                    startActivity(myIntent);
                }
                if (position==3) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood4.class);
                    startActivity(myIntent);
                }
                if (position==4) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood5.class);
                    startActivity(myIntent);
                }
                if (position==5) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood6.class);
                    startActivity(myIntent);
                }
                if (position==6) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood7.class);
                    startActivity(myIntent);
                }
                if (position==7) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood8.class);
                    startActivity(myIntent);
                }
                if (position==8) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood9.class);
                    startActivity(myIntent);
                }
                if (position==9) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood10.class);
                    startActivity(myIntent);
                }if (position==10) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood11.class);
                    startActivity(myIntent);
                }
                if (position==11) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood12.class);
                    startActivity(myIntent);
                }
                if (position==12) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood13.class);
                    startActivity(myIntent);
                }
                if (position==13) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood14.class);
                    startActivity(myIntent);
                }
                if (position==14) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood15.class);
                    startActivity(myIntent);
                }
                if (position==15) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood16.class);
                    startActivity(myIntent);
                }
                if (position==16) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood17.class);
                    startActivity(myIntent);
                }
                if (position==17) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood18.class);
                    startActivity(myIntent);
                }
                if (position==18) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood19.class);
                    startActivity(myIntent);
                }
                if (position==19) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood20.class);
                    startActivity(myIntent);
                }
                if (position==20) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood21.class);
                    startActivity(myIntent);
                }
                if (position==21) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood22.class);
                    startActivity(myIntent);
                }
                if (position==22) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood23.class);
                    startActivity(myIntent);
                }
                if (position==23) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood24.class);
                    startActivity(myIntent);
                }
                if (position==24) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood25.class);
                    startActivity(myIntent);
                }
                if (position==25) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood26.class);
                    startActivity(myIntent);
                }
                if (position==26) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood27.class);
                    startActivity(myIntent);
                }
                if (position==27) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood28.class);
                    startActivity(myIntent);
                }
                if (position==28) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood29.class);
                    startActivity(myIntent);
                }
                if (position==29) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood30.class);
                    startActivity(myIntent);
                }
                if (position==30) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood31.class);
                    startActivity(myIntent);
                }
                if (position==31) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood32.class);
                    startActivity(myIntent);
                }
                if (position==32){
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood33.class);
                    startActivity(myIntent);
                }
                if (position==33) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood34.class);
                    startActivity(myIntent);
                }
                if (position==34) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood35.class);
                    startActivity(myIntent);
                }
                if (position==35){
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood36.class);
                    startActivity(myIntent);
                }
                if (position==36) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood37.class);
                    startActivity(myIntent);
                }
                if (position==37) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood38.class);
                    startActivity(myIntent);
                }
                if (position==38){
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood39.class);
                    startActivity(myIntent);
                }
                if (position==39){
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood40.class);
                    startActivity(myIntent);
                }
                if (position==40){
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood41.class);
                    startActivity(myIntent);
                }
                if (position==41){
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood42.class);
                    startActivity(myIntent);
                }
                if (position==42){
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood43.class);
                    startActivity(myIntent);
                }
                if (position==43) {
                    Intent myIntent = new Intent(MainActivityFood.this, MainActivityFood44.class);
                    startActivity(myIntent);

                }
            }
        });
    }
}