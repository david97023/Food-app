package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivityF16 extends Activity {

    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fun1);
        ImageButton mig;
        button = findViewById(R.id.button3);
        button2 = findViewById(R.id.button4);
        mig = findViewById(R.id.imageButton6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.kilibay.net/";
                Intent ie = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(ie);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://www.google.com.tw/search?q=%E5%A5%87%E9%BA%97%E7%81%A3%E7%8F%8D%E5%A5%B6%E6%96%87%E5%8C%96%E9%A4%A8&rlz=1C1ASUM_zh-TWTW716TW716&oq=%E5%A5%87%E9%BA%97%E7%81%A3%E7%8F%8D%E5%A5%B6%E6%96%87%E5%8C%96%E9%A4%A8&aqs=chrome..69i57j0l5.253j0j4&sourceid=chrome&ie=UTF-8";
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
