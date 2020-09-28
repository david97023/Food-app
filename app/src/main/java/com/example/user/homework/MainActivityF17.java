package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityF17 extends Activity {
    ImageButton mig;
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fun1);

        mig = findViewById(R.id.imageButton6);
        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://www.jiaoxi-tourism.tw/Portal/Content.aspx?lang=0&p=002030001&area=5&id=33";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E4%BA%94%E5%B3%B0%E6%97%97%E8%81%96%E6%AF%8D%E6%9C%9D%E8%81%96%E5%9C%B0/@24.8342311,121.7448639,17z/data=!4m13!1m7!3m6!1s0x3467fbbf44b2bb5b:0xba349d16eecc911d!2z5LqU5bOw5peX54CR5biD!3b1!8m2!3d24.8342242!4d121.7470068!3m4!1s0x3467fbbfaa42c75b:0xb8046200705c5d9c!8m2!3d24.8328987!4d121.7450984?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03 988 0940"));
                startActivity(intent);
            }
        });
    }
}
