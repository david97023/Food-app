package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood30 extends Activity {
    ImageButton mig;
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_food1);

        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);

        mig = findViewById(R.id.imageButton6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.facebook.com/pages/%E5%93%88%E6%8B%89%E7%89%9B%E6%8E%92%E9%A4%A8/157361860979420?hc_ref=ARRWl5xORC0OE0t0sjdj-kyysxed1v5G1Gi6oHoO_UwzJo8UngyrHxPDyWlW2PbCGFU";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%93%88%E6%8B%89steak/@24.7482558,121.7408353,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4eb287baf21:0x9c946083d8c936a0!8m2!3d24.7482509!4d121.743024?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("03 935 9985"));
                startActivity(intent);
            }
        });
    }
}
