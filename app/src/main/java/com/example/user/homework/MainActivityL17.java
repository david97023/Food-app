package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityL17 extends Activity {
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
                String url="http://www.muchaboutiquehotel.com/zh-tw";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E6%85%95%E5%A4%8F%E7%B2%BE%E5%93%81%E6%97%85%E9%A4%A8%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8/@24.7568567,121.754699,17z/data=!3m1!4b1!4m7!3m6!1s0x3467e4da5e8bd4e5:0x44b74f5d138046ef!5m1!1s2018-06-27!8m2!3d24.7568567!4d121.7568877";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
    }
}
