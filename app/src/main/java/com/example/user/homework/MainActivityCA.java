package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCA extends Activity
{
    EditText mEditText1,mEditText2;
    Button button;
    TextView textView;
    private EditText meditText1,meditText2;
    private TextView mtextView1,mtextView2;
    private Button mbutton1,mbutton2,mbutton3,mbutton4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com);
        Intent intent=this.getIntent();
        mEditText1=(EditText)findViewById(R.id.editText);
        mEditText2=(EditText)findViewById(R.id.editText2);
        textView=(TextView)findViewById(R.id.textView5);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int lend=Integer.parseInt(mEditText1.getText().toString());
                double rate=Double.parseDouble(mEditText2.getText().toString());
                int total=(int)(lend*((100-rate)/100));
                textView.setText("打折後的價格為 : "+total+" NT$");
            }
        });
        mbutton1=(Button)findViewById(R.id.button0);
        mbutton2=(Button)findViewById(R.id.button02);
        mbutton3=(Button)findViewById(R.id.button03);
        mbutton4=(Button)findViewById(R.id.button04);
        meditText1=(EditText)findViewById(R.id.editText01);
        meditText2=(EditText)findViewById(R.id.editText02);
        mtextView1=(TextView)findViewById(R.id.textView01);
        mtextView2=(TextView)findViewById(R.id.textView03);
        mbutton1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtextView1.setText("+");
                String strRet=Integer.toString(Integer.parseInt(meditText1.getText().toString())+Integer.parseInt(meditText2.getText().toString()));
                mtextView2.setText(strRet);
            }
        });
        mbutton2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtextView1.setText("-");
                String strRet=Integer.toString(Integer.parseInt(meditText1.getText().toString())-Integer.parseInt(meditText2.getText().toString()));
                mtextView2.setText(strRet);
            }
        });
        mbutton3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtextView1.setText("x");
                String strRet=Integer.toString(Integer.parseInt(meditText1.getText().toString())*Integer.parseInt(meditText2.getText().toString()));
                mtextView2.setText(strRet);
            }
        });
        mbutton4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtextView1.setText("/");
                String strRet=Integer.toString(Integer.parseInt(meditText1.getText().toString())/Integer.parseInt(meditText2.getText().toString()));
                mtextView2.setText(strRet);
            }
        });
    }
}