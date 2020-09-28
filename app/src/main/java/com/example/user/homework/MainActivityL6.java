package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL6 extends Activity {
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
               // String url="http://www.waldenhotels.com/";
               // Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
               // startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%A4%A9%E6%96%B9%E5%A4%9C%E8%AD%9A%E6%B1%BD%E8%BB%8A%E6%97%85%E9%A4%A8/@24.7701702,121.7534294,17z/data=!3m1!4b1!4m7!3m6!1s0x3467fb2d26975607:0x5942b0e734ae1a6f!5m1!1s2018-06-27!8m2!3d24.7701702!4d121.7556181";
                Intent ie = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
