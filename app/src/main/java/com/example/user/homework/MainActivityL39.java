package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL39 extends Activity {
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
                String url="http://winddew.tw/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E7%A6%BE%E9%A2%A8%E7%AB%B9%E9%9C%B2%E7%94%9F%E6%85%8B%E4%BC%91%E9%96%92%E8%BE%B2%E5%A0%B4.%E6%B0%91%E5%AE%BF/@24.740419,121.7780933,17z/data=!3m1!4b1!4m7!3m6!1s0x3467e51644fc4ddf:0x8da03f7aed98208f!5m1!1s2018-06-27!8m2!3d24.740419!4d121.780282";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
