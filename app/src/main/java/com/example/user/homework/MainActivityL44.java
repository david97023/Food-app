package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL44 extends Activity {
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
                String url="https://www.google.com.tw/maps/place/%E5%AE%9C%E8%98%AD+12+%E8%BC%95%E6%97%85+HOUSE/@24.721286,121.7851673,17z/data=!3m1!4b1!4m7!3m6!1s0x3467e50acff11c53:0xedbafb74ed8a5a0a!5m1!1s2018-06-27!8m2!3d24.721286!4d121.787356";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
