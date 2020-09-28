package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar6 extends Activity {

    Button mButton1,mButton2,mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincar1);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://new.cpc.com.tw/Home/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%8F%B0%E7%81%A3%E4%B8%AD%E6%B2%B9+%E9%BE%8D%E6%BD%AD%E7%AB%99(%E5%8A%A0%E7%9B%9F)/@24.755304,121.7400605,14z/data=!4m8!1m2!2m1!1z5Y-w54Gj5Lit5rK5IOm-jea9reermQ!3m4!1s0x3467fb344a4f085d:0x7174e638eba18343!8m2!3d24.775513!4d121.745427?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03-928-0506"));
                startActivity(intent);
            }
        });
    }
}
