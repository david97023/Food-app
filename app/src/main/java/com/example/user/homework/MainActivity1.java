package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends Activity {
    EditText mEditText1,mEditText2;
    CheckBox mCheckBox;
    Button mButton;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Intent intent=this.getIntent();
        mEditText1=(EditText) findViewById(R.id.mAccount);
        mEditText2=(EditText) findViewById(R.id.mPassword);
        mCheckBox=(CheckBox) findViewById(R.id.mCheck);
        mButton=(Button) findViewById(R.id.button);
        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (mCheckBox.isChecked()){
                    mEditText2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    mEditText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=mEditText1.getText().toString();
                String s2=mEditText2.getText().toString();
/*
                if(s1==s2){
                    Toast.makeText(MainActivity1.this, "登入成功", Toast.LENGTH_SHORT).show();
                    Intent mIntent = new Intent(MainActivity1.this, MainActivity2.class);
                    startActivity(mIntent);
                }else{
                    Toast.makeText(MainActivity1.this, "登入失敗", Toast.LENGTH_SHORT).show();
                }
*/
                Toast.makeText(MainActivity1.this, "登入成功", Toast.LENGTH_SHORT).show();
                Intent mIntent = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(mIntent);

            }
        });
    }
}