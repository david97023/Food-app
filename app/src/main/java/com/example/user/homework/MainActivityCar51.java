package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar51 extends Activity {

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
                String url="https://www.ctbcbank.com/CTCBPortalWeb/appmanager/ebank/rb";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E4%B8%AD%E5%9C%8B%E4%BF%A1%E8%A8%97%E5%95%86%E6%A5%AD%E9%8A%80%E8%A1%8CATM/@24.7519898,121.7490852,15z/data=!4m8!1m2!2m1!1z5Lit5ZyL5L-h6KiX5ZWG5qWt6YqA6KGMQVRN!3m4!1s0x3442a99a61435e1b:0x73516e180d86d380!8m2!3d24.7466551!4d121.7494491";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:080-002-4365"));
                startActivity(intent);
            }
        });
    }
}
