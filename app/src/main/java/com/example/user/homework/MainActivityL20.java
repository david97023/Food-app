package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL20 extends Activity {
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
                String url="http://elbnb.com/ncastle/about.php";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%A4%9C%E5%B8%82%E6%A9%99%E5%A0%A1%E6%B8%A1%E5%81%87%E6%97%85%E9%A4%A8/@24.7563501,121.7555898,17z/data=!3m1!4b1!4m7!3m6!1s0x3467e4da465a3741:0x6f3ef999a01b9a56!5m1!1s2018-06-27!8m2!3d24.7563501!4d121.7577785";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
