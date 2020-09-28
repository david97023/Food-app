package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar37 extends Activity {

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
                String url="http://lacoste.strikingly.com/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%B0%8F%E9%B1%B7%E9%AD%9A%E6%97%85%E9%81%8A%E8%BB%8A%E9%9A%8A~%E6%9D%BE%E5%B1%B1-%E6%A1%83%E5%9C%92%E6%A9%9F%E5%A0%B4%E6%8E%A5%E9%80%81~%E7%92%B0%E5%B3%B6-%E8%87%AA%E7%94%B1%E8%A1%8C-%E5%A4%AA%E5%B9%B3%E5%B1%B1%E5%8C%85%E8%BB%8A%E6%9C%8D%E5%8B%99(%E5%AE%9C%E8%98%AD%E5%8F%B0%E5%8C%97%E4%B9%9D%E5%BA%A7T5%E5%8C%85%E8%BB%8A%E5%87%BA%E7%A7%9F%EF%BC%89/@24.7527837,121.7526014,16z/data=!4m8!1m2!2m1!1z5bCP6bG36a2a5peF6YGK6LuK6ZqK!3m4!1s0x3467fba666cdc0eb:0x7cd97c91265e5aab!8m2!3d24.752179!4d121.74668";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03-938-6179"));
                startActivity(intent);
            }
        });
    }
}
