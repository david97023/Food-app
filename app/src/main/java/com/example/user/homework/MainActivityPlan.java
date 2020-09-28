package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivityPlan extends Activity {
    TextView textView;
    Button mButton;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,
            checkBox10,checkBox11,checkBox12,checkBox13,checkBox14;
    //SearchView mSearchView;
    int cunt=0;
    String[] array = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_plan);
        for(int i=0;i<14;i++){
            array[i]="";
        }
        mButton = findViewById(R.id.button2);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);
        checkBox11 = findViewById(R.id.checkBox11);
        checkBox12 = findViewById(R.id.checkBox12);
        checkBox13 = findViewById(R.id.checkBox13);
        checkBox14 = findViewById(R.id.checkBox14);
        CheckBoxListener listener = new CheckBoxListener();
        checkBox1.setOnClickListener(listener);
        checkBox2.setOnClickListener(listener);
        checkBox3.setOnClickListener(listener);
        checkBox4.setOnClickListener(listener);
        checkBox5.setOnClickListener(listener);
        checkBox6.setOnClickListener(listener);
        checkBox7.setOnClickListener(listener);
        checkBox8.setOnClickListener(listener);
        checkBox9.setOnClickListener(listener);
        checkBox10.setOnClickListener(listener);
        checkBox11.setOnClickListener(listener);
        checkBox12.setOnClickListener(listener);
        checkBox13.setOnClickListener(listener);
        checkBox14.setOnClickListener(listener);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cunt==0){ Toast.makeText(getApplicationContext(),"無新增資料",Toast.LENGTH_SHORT).show();}
                    else { Toast.makeText(getApplicationContext(),"新增資料!!",Toast.LENGTH_SHORT).show();}
                Intent mIntent = new Intent();
                mIntent.setClass(MainActivityPlan.this,MainActivityoplan2.class);
                Bundle bundle = new Bundle();
                bundle.putStringArray("array",array);
                mIntent.putExtras(bundle);
                startActivity(mIntent);
            }
        });
    }

    class CheckBoxListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            CheckBox checkBox = (CheckBox) v;
            if(checkBox.getId()==R.id.checkBox){
                if(checkBox.isChecked()){
                    array[0]="老眷村";
                    cunt++;
                }else{
                    array[0]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox2){
                if(checkBox.isChecked()){
                    array[1]="招妹飲食店";
                    cunt++;
                }else{
                    array[1]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox3){
                if(checkBox.isChecked()){
                    array[2]="吉辰鐵板燒";
                    cunt++;
                }else{
                    array[2]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox4){
                if(checkBox.isChecked()){
                    array[3]="綠海咖啡";
                    cunt++;
                }else{
                    array[3]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox5){
                if(checkBox.isChecked()){
                    array[4]="麵工匠×手工麵專賣";
                    cunt++;
                }else{
                    array[4]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox6){
                if(checkBox.isChecked()){
                    array[5]="FEED ME美式餐廳(宜蘭店)";
                    cunt++;
                }else{
                    array[5]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox7){
                if(checkBox.isChecked()){
                    array[6]="深山牧場壽喜燒";
                    cunt++;
                }else{
                    array[6]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox8){
                if(checkBox.isChecked()){
                    array[7]="享涮涮涮鍋";
                    cunt++;
                }else{
                    array[7]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox9){
                if(checkBox.isChecked()){
                    array[8]="必勝";
                    cunt++;
                }else{
                    array[8]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox10){
                if(checkBox.isChecked()){
                    array[9]="北灣平價牛排";
                    cunt++;
                }else{
                    array[9]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox11){
                if(checkBox.isChecked()){
                    array[10]="上乘三家(宜蘭店)";
                    cunt++;
                }else{
                    array[10]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox12){
                if(checkBox.isChecked()){
                    array[11]="猿燒日式料理";
                    cunt++;
                }else{
                    array[11]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox13){
                if(checkBox.isChecked()){
                    array[12]="1491越南牛排";
                    cunt++;
                }else{
                    array[12]="";cunt--;
                }
            }
            if(checkBox.getId()==R.id.checkBox14){
                if(checkBox.isChecked()){
                    array[13]="漁川鍋物";
                    cunt++;
                }else{
                    array[13]="";cunt--;
                }
            }
        }
    }
}
