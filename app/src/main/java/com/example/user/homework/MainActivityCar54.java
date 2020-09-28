package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar54 extends Activity {

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
                String url="https://www.facebook.com/%E5%AE%9C%E8%98%AD%E5%B1%B1%E6%B0%B4%E6%97%85%E9%81%8A-%E9%81%8A%E8%A6%BD%E8%BB%8A%E5%85%AC%E5%8F%B8-905854222884006/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%B1%B1%E6%B0%B4%E7%A7%9F%E8%BB%8A/@24.7504102,121.7567064,17z/data=!4m8!1m2!2m1!1z5bGx5rC056ef6LuK!3m4!1s0x3467e4dc34f3eccd:0x5904491fe9550ac0!8m2!3d24.7502427!4d121.7582643";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03-938-7378"));
                startActivity(intent);
            }
        });
    }
}
