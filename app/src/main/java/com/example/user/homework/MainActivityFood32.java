package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood32 extends Activity {
    ImageButton mig;

    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food1);
        mig = findViewById(R.id.imageButton6);
        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.facebook.com/%E8%B1%9A%E5%B0%87%E5%AE%9C%E5%A4%A7%E5%BA%97-520374478307638/?hc_ref=ARRffNTCvqnT1SGUxhEIMxgBfT-fGnZ6oPfNZzQ3YSKBHkoIA7e4PiLDjzYgyXlh6qA&fref=nf";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E8%B1%9A%E5%B0%87%E6%97%A5%E6%9C%AC%E6%8B%89%E9%BA%B5-%E5%AE%9C%E5%A4%A7%E5%BA%97/@24.7488832,121.7480853,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4e9d0ed670f:0x23f29c4c8e25e175!8m2!3d24.7488783!4d121.750274?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("03 933 3128"));
                startActivity(intent);
            }
        });
    }
}
