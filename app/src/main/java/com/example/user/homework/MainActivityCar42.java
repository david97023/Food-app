package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar42 extends Activity {

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
                String url="http://twypage.com/sd-57201-C-%E5%AE%9C%E8%98%AD-%E6%AD%A3%E5%AE%B9%E5%8A%A0%E6%B2%B9%E7%AB%99%E5%AF%A6%E6%A5%AD%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8.html";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E6%AD%A3%E5%AE%B9%E5%8A%A0%E6%B2%B9%E7%AB%99%E5%AF%A6%E6%A5%AD%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8/@24.7786827,121.7625785,14z/data=!4m8!1m2!2m1!1z5q2j5a655Yqg5rK556uZ!3m4!1s0x3467fb344a4f085d:0x16b6229c20790105!8m2!3d24.7755131!4d121.745427";
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
