package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL53 extends Activity {
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
                String url="http://www.yosemite.idv.tw/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%84%AA%E5%8B%9D%E7%BE%8E%E5%9C%B0%E9%9F%B3%E6%A8%82%E6%B0%91%E5%AE%BF/@24.7456527,121.7337048,17z/data=!3m1!4b1!4m7!3m6!1s0x3467e4916fc15ff5:0x4f9d9e0dc76d0c67!5m1!1s2018-06-27!8m2!3d24.7456527!4d121.7358935";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
