package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityCar36 extends Activity {

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
                String url="https://airport-shuttle-service-545.business.site/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%AE%9C%E8%98%AD%E5%8C%85%E8%BB%8A%E6%97%85%E9%81%8A~%E6%A1%83%E5%9C%92%E6%A9%9F%E5%A0%B4%E6%8E%A5%E9%80%81~%E5%B0%8F%E5%90%B3%E6%97%85%E9%81%8A%E8%BB%8A%E9%9A%8A/@24.671907,121.7874553,15z/data=!4m8!1m2!2m1!1z5bG56LGQ56ef6LuKIOWunOiYreapn-WgtOaOpemAgeWMhei7iuaXhemBig!3m4!1s0x3467e609039bc39d:0xab691c78dff96d1d!8m2!3d24.671907!4d121.79621";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0906-823-888"));
                startActivity(intent);
            }
        });
    }
}
