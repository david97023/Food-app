package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityFood9 extends Activity {
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
                String url="https://www.facebook.com/%E5%BF%85%E5%8B%9D%E5%AE%A2-Pizza-Hut-%E5%AE%9C%E8%98%AD%E5%A4%96%E9%80%81%E5%BA%97-294363550686684/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps/place/%E5%BF%85%E5%8B%9D%E5%AE%A2/@24.7477773,121.7476996,17z/data=!3m1!4b1!4m5!3m4!1s0x3467e4e9b958cbd3:0x941f1d8f451e95fe!8m2!3d24.7477724!4d121.7498883?hl=zh-TW";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });
        mig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03 935 5151"));
                startActivity(intent);
            }
        });
    }
}
