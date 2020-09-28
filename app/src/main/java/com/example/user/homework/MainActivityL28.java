package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL28 extends Activity {
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
                String url="http://www.tsaiyu.com/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E7%A6%BE%E9%A2%A8%E5%BD%A9%E9%AD%9A%E6%9C%83%E9%A4%A8/@24.7654168,121.7937117,17z/data=!3m1!4b1!4m7!3m6!1s0x3467fab17b7d065f:0xc2acfcb9c9c84985!5m1!1s2018-06-27!8m2!3d24.7654168!4d121.7959004";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
