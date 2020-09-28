package com.example.user.homework;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends Activity {

    ListView mListView;
    SearchView mSearchView;
    FirebaseDatabase database;
    DatabaseReference ref;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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

        car = new Car();
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Car");
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.car_info,R.id.carinfo, list);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds: dataSnapshot.getChildren()) {
                    car = ds.getValue(Car.class);
                    list.add(car.getName().toString() + "\n" + car.getAddr().toString() + "\n" + car.getTel().toString());
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
                        Intent myIntent = new Intent(MainActivity3.this, MainActivityCar1.class);
                        startActivity(myIntent);
                }

                if (position==1) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar2.class);
                    startActivity(myIntent);
                }

                if (position==2) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar3.class);
                    startActivity(myIntent);
                }

                if (position==3) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar4.class);
                    startActivity(myIntent);
                }

                if (position==4) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar5.class);
                    startActivity(myIntent);
                }

                if (position==5) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar6.class);
                    startActivity(myIntent);
                }

                if (position==6) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar7.class);
                    startActivity(myIntent);
                }

                if (position==7) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar8.class);
                    startActivity(myIntent);
                }

                if (position==8) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar9.class);
                    startActivity(myIntent);
                }

                if (position==9) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar10.class);
                    startActivity(myIntent);
                }

                if (position==10) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar11.class);
                    startActivity(myIntent);
                }

                if (position==11) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar12.class);
                    startActivity(myIntent);
                }

                if (position==12) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar13.class);
                    startActivity(myIntent);
                }

                if (position==13) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar14.class);
                    startActivity(myIntent);
                }

                if (position==14) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar15.class);
                    startActivity(myIntent);
                }

                if (position==15) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar16.class);
                    startActivity(myIntent);
                }

                if (position==16) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar17.class);
                    startActivity(myIntent);
                }

                if (position==17) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar18.class);
                    startActivity(myIntent);
                }

                if (position==18) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar19.class);
                    startActivity(myIntent);
                }

                if (position==19) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar20.class);
                    startActivity(myIntent);
                }

                if (position==20) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar21.class);
                    startActivity(myIntent);
                }

                if (position==21) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar22.class);
                    startActivity(myIntent);
                }

                if (position==22) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar23.class);
                    startActivity(myIntent);
                }

                if (position==23) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar24.class);
                    startActivity(myIntent);
                }

                if (position==24) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar25.class);
                    startActivity(myIntent);
                }

                if (position==25) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar26.class);
                    startActivity(myIntent);
                }

                if (position==26) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar27.class);
                    startActivity(myIntent);
                }

                if (position==27) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar28.class);
                    startActivity(myIntent);
                }

                if (position==28) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar29.class);
                    startActivity(myIntent);
                }

                if (position==29) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar30.class);
                    startActivity(myIntent);
                }

                if (position==30) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar31.class);
                    startActivity(myIntent);
                }

                if (position==31) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar32.class);
                    startActivity(myIntent);
                }

                if (position==32) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar33.class);
                    startActivity(myIntent);
                }

                if (position==33) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar34.class);
                    startActivity(myIntent);
                }

                if (position==34) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar35.class);
                    startActivity(myIntent);
                }

                if (position==35) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar36.class);
                    startActivity(myIntent);
                }

                if (position==36) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar37.class);
                    startActivity(myIntent);
                }

                if (position==37) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar38.class);
                    startActivity(myIntent);
                }

                if (position==38) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar39.class);
                    startActivity(myIntent);
                }

                if (position==39) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar40.class);
                    startActivity(myIntent);
                }

                if (position==40) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar41.class);
                    startActivity(myIntent);
                }

                if (position==41) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar42.class);
                    startActivity(myIntent);
                }

                if (position==42) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar43.class);
                    startActivity(myIntent);
                }

                if (position==43) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar44.class);
                    startActivity(myIntent);
                }

                if (position==44) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar45.class);
                    startActivity(myIntent);
                }

                if (position==45) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar46.class);
                    startActivity(myIntent);
                }

                if (position==46) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar47.class);
                    startActivity(myIntent);
                }

                if (position==47) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar48.class);
                    startActivity(myIntent);
                }

                if (position==48) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar49.class);
                    startActivity(myIntent);
                }

                if (position==49) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar50.class);
                    startActivity(myIntent);
                }

                if (position==50) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar51.class);
                    startActivity(myIntent);
                }

                if (position==51) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar52.class);
                    startActivity(myIntent);
                }

                if (position==52) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar53.class);
                    startActivity(myIntent);
                }

                if (position==53) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar54.class);
                    startActivity(myIntent);
                }

                if (position==54) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar55.class);
                    startActivity(myIntent);
                }

                if (position==55) {
                    Intent myIntent = new Intent(MainActivity3.this, MainActivityCar56.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
