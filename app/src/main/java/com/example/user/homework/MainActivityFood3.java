package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood3 extends Activity {
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
                String url="https://www.facebook.com/%E6%8B%9B%E5%A6%B9%E9%A3%B2%E9%A3%9F%E5%BA%97-426820901047595/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E6%8B%9B%E5%A6%B9%E9%A3%B2%E9%A3%9F%E5%BA%97/@24.7430904,121.7456048,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4ec210df13b:0x36273dffc51584a!8m2!3d24.7430855!4d121.7477935?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03 935 2294"));
                startActivity(intent);
            }
        });
    }
}
