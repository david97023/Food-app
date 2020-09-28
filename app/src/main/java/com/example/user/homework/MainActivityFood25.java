package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood25 extends Activity {
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
                String url="https://www.facebook.com/%E5%85%AD%E7%9C%B7%E6%9D%91%E9%BA%BB%E8%BE%A3%E9%B4%9B%E9%B4%A6%E9%8D%8B-683159811801738/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%85%AD%E7%9C%B7%E6%9D%91%E9%BA%BB%E8%BE%A3%E9%B4%9B%E9%B4%A6%E9%8D%8B%E5%88%80%E5%89%8A%E7%89%9B%E8%82%89%E9%BA%B5/@24.7482899,121.7306223,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4eb35e5b51d:0x1d0d55aaaddbae52!8m2!3d24.748285!4d121.732811?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("03 932 4518"));
                startActivity(intent);
            }
        });
    }
}
