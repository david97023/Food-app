package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood21 extends Activity {

    ImageButton mig;
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food1);

        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);
        mig = findViewById(R.id.imageButton6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.facebook.com/pages/%E7%9F%B3%E9%A0%AD%E7%89%9B%E8%82%89%E9%BA%B5%E5%BA%97/104799072929677";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E7%9F%B3%E9%A0%AD%E7%89%9B%E8%82%89%E9%BA%B5/@24.747072,121.750181,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4e9ebd2b7e5:0xa580d8acd2cf3367!8m2!3d24.7470671!4d121.7523697?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("03 936 3699"));
                startActivity(intent);
            }
        });
    }
}
