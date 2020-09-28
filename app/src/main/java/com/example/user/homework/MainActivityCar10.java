package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar10 extends Activity {

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
                String url="https://www.facebook.com/pages/biz/%E5%AE%9C%E8%98%AD%E4%B8%AD%E6%A3%AE%E6%B1%BD%E8%BB%8A%E4%BB%A3%E6%AA%A2%E5%BB%A0-180991715308538/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E4%B8%AD%E6%A3%AE%E5%8A%A0%E6%B2%B9%E7%AB%99%E9%A9%97%E8%BB%8A%E5%BB%A0/@24.7795236,121.7571546,17z/data=!3m1!4b1!4m5!3m4!1s0x3467fb260771801d:0xf72cf2664ad057c4!8m2!3d24.7795187!4d121.7593486?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03-928-9728"));
                startActivity(intent);
            }
        });
    }
}
