package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar38 extends Activity {

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
                String url="https://www.facebook.com/%E5%AE%9C%E8%98%AD%E9%9B%BB%E5%8B%95%E8%BB%8A-%E9%9B%BB%E5%8B%95%E5%9B%9B%E8%BC%AA%E4%BB%A3%E6%AD%A5%E8%BB%8A-%E9%9B%BB%E5%8B%95%E4%B8%89%E8%BC%AA%E8%BB%8A-%E6%BA%90%E8%88%88%E8%BB%8A%E8%A1%8C-792740850763380/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E6%BA%90%E8%88%88%E8%BB%8A%E8%A1%8C+%E6%8D%B7%E5%AE%89%E7%89%B9/@24.7565538,121.7527747,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4dadc3209f7:0xc7bc97581ef351d4!8m2!3d24.7565489!4d121.7549687";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03-932-4815"));
                startActivity(intent);
            }
        });
    }
}
