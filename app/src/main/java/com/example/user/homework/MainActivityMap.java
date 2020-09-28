package com.example.user.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityMap extends Activity
{
    public static boolean bIfDebug = false;
    public static String TAG = "HIPPO_DEBUG";
    private TextView mTextView01;
    private EditText mEditText01,mEditText02,mEditText03;
    private Button mButton01, mButton02, mButton03;
    private LinearLayout mLinearLayout01;
    private ArrayList<String> mList = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    // http://data.taipei/
    private String strAddress = "";

    //private NetworkReceiver receiver = new NetworkReceiver();
    public static final String WIFI = "Wi-Fi";
    public static final String ANY = "Any";
    private static boolean wifiConnected = false;
    private static boolean mobileConnected = false;
    public static boolean refreshDisplay = true;
    public static String sPref = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Intent intent=this.getIntent();
        //init();
    }
}