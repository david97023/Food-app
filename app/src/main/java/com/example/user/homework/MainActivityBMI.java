package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivityBMI extends Activity
{
    private EditText etheight;
    private EditText etweight;
    private RadioButton rb1;
    private RadioButton rb2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        etheight=(EditText) findViewById(R.id.editText);
        etweight=(EditText) findViewById(R.id.editText2);
        rb1=(RadioButton) findViewById(R.id.radioButton1);
        rb2=(RadioButton) findViewById(R.id.radioButton2);

        final Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                //從輸入介面中取出了的身高、體重值，要將身高、體重值傳送給 child_Activity 後作計算
                double h=Double.parseDouble(etheight.getText().toString());
                double w=Double.parseDouble(etweight.getText().toString());
                String sex=rb1.isChecked() ?"M":"F";
                //這些附加在 Intent 上的訊息都儲存在 Bundle 物件中
                Bundle bundle=new Bundle();
                bundle.putDouble("height",h);
                bundle.putDouble("weight",w);
                bundle.putString("Sex",sex);
                //透過「intent.putExtras(bundle)」敘述，將「bundle」 物件附加在 Intent 上，隨著 Intent 送出而送出
                Intent intent=new Intent(MainActivityBMI.this,MainActivityBMI_child.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}