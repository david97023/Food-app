package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL51 extends Activity {
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
                String url="http://yinmama.ego.tw/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%AE%9C%E8%98%AD%E2%80%A7%E5%B0%B9%E5%AA%BD%E5%AA%BD%E6%BA%AB%E9%A6%A8%E5%B0%8F%E5%B1%8B/@24.7287286,121.7348085,17z/data=!3m1!4b1!4m7!3m6!1s0x3467e463cf774db1:0x975ceb6d634ee75b!5m1!1s2018-06-27!8m2!3d24.7287286!4d121.7369972";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
