package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityL1 extends Activity {

    Button button,button2;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_l1);

        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);
        imageButton = findViewById(R.id.imageButton6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="http://www.fukun.com.tw/WebMaster/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/maps?q=%E7%A6%8F%E5%B2%A13%E8%99%9F%E6%B1%BD%E8%BB%8A%E6%97%85%E9%A4%A8&rlz=1C1TIGY_enTW709TW709&um=1&ie=UTF-8&sa=X&ved=0ahUKEwi-yq-rh9LbAhUS5rwKHfEFCogQ_AUICigB";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03 928 8060"));
                startActivity(intent);
            }
        });
    }
}
