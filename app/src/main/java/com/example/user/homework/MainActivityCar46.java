package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar46 extends Activity {

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
                String url="https://www.firstbank.com.tw/servlet/fbweb/Home";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E7%AC%AC%E4%B8%80%E9%8A%80%E8%A1%8CATM(%E8%A8%AD%E7%BD%AE%E9%BB%9E%E5%AE%9C%E8%98%AD%E5%88%86%E8%A1%8C)/@24.7517974,121.7492997,15z/data=!4m8!1m2!2m1!1z56ys5LiA6YqA6KGMQVRN5a6c6Jit!3m4!1s0x3467e4c557c96995:0x6bf88129c4f1d27f!8m2!3d24.7589818!4d121.7530463";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02-2181-1111"));
                startActivity(intent);
            }
        });
    }
}
