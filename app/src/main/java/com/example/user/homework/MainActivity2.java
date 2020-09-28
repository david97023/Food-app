package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class MainActivity2 extends Activity {
    ImageButton mImageButton1,mImageButton2,mImageButton3,mImageButton4,mImageButton5,mImageButton6;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=this.getIntent();
        mediaPlayer=MediaPlayer.create(MainActivity2.this,R.raw.light);
        mediaPlayer.setLooping(true);
        mImageButton1 = findViewById(R.id.imageButton1);
        mImageButton2 = findViewById(R.id.imageButton2);
        mImageButton3 = findViewById(R.id.imageButton3);
        mImageButton4 = findViewById(R.id.imageButton4);
        mImageButton5 = findViewById(R.id.imageButton5);
        mImageButton6 = findViewById(R.id.imageButton6);
        mImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityFood.class);
                startActivity(mIntent);
            }
        });
        mImageButton2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent mIntent = new Intent(MainActivity2.this, MainActivityBMI.class);
                 startActivity(mIntent);
             }
         });
        mImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityCA.class);
                startActivity(mIntent);
            }
        });
        mImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityNote.class);
                startActivity(mIntent);
            }
        });
        mImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(mIntent);
            }
        });
        mImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity2.this, MainActivityMap.class);
                startActivity(mIntent);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        try {
            if (mediaPlayer!=null) {
                mediaPlayer.stop();
            }
            mediaPlayer.prepare();
            mediaPlayer.start();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
}