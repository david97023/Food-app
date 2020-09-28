package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityF7 extends Activity {
    ImageButton mig;

    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fun1);

        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);
        mig = findViewById(R.id.imageButton6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://taiwanbike.tw/Article.aspx?sNo=02000179";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%A3%AF%E5%9C%8D%E6%BF%B1%E6%B5%B7%E8%87%AA%E8%A1%8C%E8%BB%8A%E9%81%93/@24.7174139,121.8259953,17z/data=!3m1!4b1!4m5!3m4!1s0x3467ef997957cfcf:0xa52dcf366dd0c2d0!8m2!3d24.717409!4d121.828184?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03 938 3012"));
                startActivity(intent);
            }
        });
    }
}
