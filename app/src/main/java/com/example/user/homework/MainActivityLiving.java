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

public class MainActivityLiving extends Activity {

    ListView mListView;
    SearchView mSearchView;
    FirebaseDatabase database;
    DatabaseReference ref;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Living living;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_1);

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

        living = new Living();
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("nLiving");
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.car_info,R.id.carinfo, list);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds: dataSnapshot.getChildren()) {
                    living = ds.getValue(Living.class);
                    list.add(living.getN().toString() + "\n" + living.getA().toString() + "\n" + living.getP().toString());
                }
                mListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        //adapter = new ArrayAdapter<String>(this,R.layout.car_info,R.id.carinfo, list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.simple_list_item_1,
                android.R.id.text1);

        DatabaseReference reference_contacts = FirebaseDatabase.getInstance().getReference("Living");
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

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL1.class);
                    startActivity(myIntent);
                }

                if (position==1) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL2.class);
                    startActivity(myIntent);
                }

                if (position==2) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL3.class);
                    startActivity(myIntent);
                }

                if (position==3) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL4.class);
                    startActivity(myIntent);
                }

                if (position==4) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL5.class);
                    startActivity(myIntent);
                }

                if (position==5) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL6.class);
                    startActivity(myIntent);
                }

                if (position==6) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL7.class);
                    startActivity(myIntent);
                }

                if (position==7) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL8.class);
                    startActivity(myIntent);
                }

                if (position==8) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL9.class);
                    startActivity(myIntent);
                }

                if (position==9) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL10.class);
                    startActivity(myIntent);
                }

                if (position==10) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL11.class);
                    startActivity(myIntent);
                }

                if (position==11) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL12.class);
                    startActivity(myIntent);
                }

                if (position==12) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL13.class);
                    startActivity(myIntent);
                }

                if (position==13) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL14.class);
                    startActivity(myIntent);
                }

                if (position==14) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL15.class);
                    startActivity(myIntent);
                }

                if (position==15) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL16.class);
                    startActivity(myIntent);
                }

                if (position==16) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL17.class);
                    startActivity(myIntent);
                }

                if (position==17) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL18.class);
                    startActivity(myIntent);
                }

                if (position==18) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL19.class);
                    startActivity(myIntent);
                }

                if (position==19) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL20.class);
                    startActivity(myIntent);
                }

                if (position==20) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL21.class);
                    startActivity(myIntent);
                }

                if (position==21) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL22.class);
                    startActivity(myIntent);
                }

                if (position==22) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL23.class);
                    startActivity(myIntent);
                }

                if (position==23) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL24.class);
                    startActivity(myIntent);
                }

                if (position==24) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL25.class);
                    startActivity(myIntent);
                }

                if (position==25) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL26.class);
                    startActivity(myIntent);
                }

                if (position==26) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL27.class);
                    startActivity(myIntent);
                }

                if (position==27) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL28.class);
                    startActivity(myIntent);
                }

                if (position==28) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL29.class);
                    startActivity(myIntent);
                }

                if (position==29) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL30.class);
                    startActivity(myIntent);
                }

                if (position==30) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL31.class);
                    startActivity(myIntent);
                }

                if (position==31) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL32.class);
                    startActivity(myIntent);
                }

                if (position==32) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL33.class);
                    startActivity(myIntent);
                }

                if (position==33) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL34.class);
                    startActivity(myIntent);
                }

                if (position==34) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL35.class);
                    startActivity(myIntent);
                }

                if (position==35) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL36.class);
                    startActivity(myIntent);
                }

                if (position==36) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL37.class);
                    startActivity(myIntent);
                }

                if (position==37) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL38.class);
                    startActivity(myIntent);
                }

                if (position==38) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL39.class);
                    startActivity(myIntent);
                }

                if (position==39) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL40.class);
                    startActivity(myIntent);
                }

                if (position==40) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL41.class);
                    startActivity(myIntent);
                }

                if (position==41) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL42.class);
                    startActivity(myIntent);
                }

                if (position==42) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL43.class);
                    startActivity(myIntent);
                }

                if (position==43) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL44.class);
                    startActivity(myIntent);
                }

                if (position==44) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL45.class);
                    startActivity(myIntent);
                }

                if (position==45) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL46.class);
                    startActivity(myIntent);
                }

                if (position==46) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL47.class);
                    startActivity(myIntent);
                }

                if (position==47) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL48.class);
                    startActivity(myIntent);
                }

                if (position==48) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL49.class);
                    startActivity(myIntent);
                }

                if (position==49) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL50.class);
                    startActivity(myIntent);
                }

                if (position==50) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL51.class);
                    startActivity(myIntent);
                }

                if (position==51) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL52.class);
                    startActivity(myIntent);
                }

                if (position==52) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL53.class);
                    startActivity(myIntent);
                }

                if (position==53) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL54.class);
                    startActivity(myIntent);
                }

                if (position==54) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL55.class);
                    startActivity(myIntent);
                }

                if (position==55) {
                    Intent myIntent = new Intent(MainActivityLiving.this, MainActivityL56.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
