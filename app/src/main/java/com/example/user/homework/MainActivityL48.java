package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL48 extends Activity {
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
                String url="http://illc.iibnb.net/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%AE%9C%E8%98%AD%2F%E7%BE%85%E6%9D%B1%E8%98%AD%E9%99%BD%E6%B2%B3%E7%95%94%E5%B1%85%E6%B0%91%E5%AE%BF/@24.7445563,121.7392871,14z/data=!4m10!1m2!2m1!1z5a6c6JitL-e-headseiYremZveays-eVlOWxheawkeWuvw!3m6!1s0x3467e459b6e96ed5:0xc3d6aff48c36183e!5m1!1s2018-06-27!8m2!3d24.724341!4d121.752225";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
