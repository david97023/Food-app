package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL23 extends Activity {
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
                String url="https://www.google.com.tw/maps/place/%E5%AE%9C%E8%98%AD%E5%BF%AB%E6%A8%82%E5%B9%BE%E8%BF%B7%E6%9C%83%E9%A4%A8/@24.7542265,121.7494814,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4c27ca063f9:0x28f038e25dbf9273!8m2!3d24.7542265!4d121.7516701";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
