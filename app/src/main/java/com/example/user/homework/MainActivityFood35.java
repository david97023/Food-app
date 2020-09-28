package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood35 extends Activity {
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
                String url="http://www.mcdonalds.com.tw/tw/ch/index.html";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E9%BA%A5%E7%95%B6%E5%8B%9E%E5%AE%9C%E8%98%AD%E6%96%B0%E6%9C%88%E5%BB%A3%E5%A0%B4%E5%BA%97/@24.7543758,121.749589,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4c362a85f8f:0x19003812f6620abe!8m2!3d24.7543709!4d121.7517777?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("03 933 4829"));
                startActivity(intent);
            }
        });
    }
}
