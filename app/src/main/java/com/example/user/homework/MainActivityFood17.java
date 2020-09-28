package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood17 extends Activity {
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
                String url="https://www.facebook.com/Sale-e-Pepe-%E8%83%A1%E6%A4%92-%E9%B9%BD-%E7%89%9B%E6%8E%92-1578385585760097/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/SALE+%26+PEPE+%E8%83%A1%E6%A4%92+%E9%B9%BD+%E7%89%9B%E6%8E%92/@24.7515469,121.7530153,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4dce81a15fb:0xe4f70335c117d3d3!8m2!3d24.751542!4d121.755204?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("03 936 5066"));
                startActivity(intent);
            }
        });
    }
}
