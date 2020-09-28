package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood41 extends Activity {
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
                String url="https://www.facebook.com/%E5%8D%83%E5%85%B5%E8%A1%9B-%E6%97%A5%E5%BC%8F%E7%87%92%E8%82%89%E9%8D%8B%E7%89%A9-%E5%AE%9C%E8%98%AD%E5%BA%97-588148881311009/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%8D%83%E5%85%B5%E8%A1%9B%E6%97%A5%E5%BC%8F%E7%87%92%E8%82%89%E9%8D%8B%E7%89%A9%E5%AE%9C%E8%98%AD%E5%BA%97/@24.7585628,121.7566979,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4d0b1d040f5:0x99739963863a35b3!8m2!3d24.7585579!4d121.7588866?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("03 932 5545"));
                startActivity(intent);
            }
        });
    }
}
