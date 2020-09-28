package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL33 extends Activity {
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_l1);
        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String url="";
               // Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
               // startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E8%98%AD%E9%99%BD%E8%8A%B1%E9%B3%A5%E5%9C%92/@24.7727998,121.7719409,17z/data=!3m1!4b1!4m7!3m6!1s0x3467fb2bcefc9a67:0x18bc93dddd63c8f0!5m1!1s2018-06-27!8m2!3d24.7727998!4d121.7741296";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
