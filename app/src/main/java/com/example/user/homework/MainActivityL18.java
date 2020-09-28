package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL18 extends Activity {
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
                String url="https://www.google.com.tw/maps/place/%E8%B5%B0%E8%B5%B0%E5%81%9C%E5%81%9C%E5%9C%8B%E9%9A%9B%E9%9D%92%E5%B9%B4%E6%97%85%E8%88%8DSTAY+INN+international+hostel/@24.7568488,121.7544766,17z/data=!3m1!4b1!4m7!3m6!1s0x3467e4da5f09ff75:0x1f9d5678e33eb75c!5m1!1s2018-06-27!8m2!3d24.7568488!4d121.7566653";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
