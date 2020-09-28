package com.example.user.homework;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivityNote extends Activity
{
    private static final String DBNAME = "MY_DB";
    private static final String TABLENAME = "MY_TABLE";
    private static final String FIELD01_NAME = "_id";
    private static final String FIELD02_NAME = "_text1";
    private SQLiteDatabase dataBase;
    private android.database.Cursor cursor;
    private int _id = -1;
    private EditText EditText01;
    private Button Button01;
    private Button Button02;
    private Button Button03;
    private ListView ListView01;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        Intent intent=this.getIntent();
        EditText01 = (EditText) findViewById(R.id.EditText01);
        Button01 = (Button) findViewById(R.id.BtnAdd);
        Button02 = (Button) findViewById(R.id.BtnUpdate);
        Button03 = (Button) findViewById(R.id.BtnDelete);
        ListView01 = (ListView) findViewById(R.id.ListView01);

        Button02.setEnabled(false);
        Button03.setEnabled(false);

        String CREATE_SQL = "create table if not exists " + TABLENAME + " (" + FIELD01_NAME + " integer primary key autoincrement, " + FIELD02_NAME + " varchar not null);";
        dataBase=openOrCreateDatabase(DBNAME,MODE_PRIVATE,null);
        dataBase.execSQL(CREATE_SQL);
        cursor=dataBase.query(TABLENAME,null,null,null,null,null,null);

        android.widget.SimpleCursorAdapter adapter = new android.widget.SimpleCursorAdapter(this, R.layout.list,
                cursor, new String[]
                {FIELD02_NAME}, new int[]
                {R.id.CheckedTextView01},0);
        ListView01.setAdapter(adapter);

        Button01.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                // TODO Auto-generated method stub
                if(!EditText01.getText().equals(""))
                {
                    insert("" + EditText01.getText());
                }
            }
        });
        Button02.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                // TODO Auto-generated method stub
                if(_id != -1 && !EditText01.getText().equals(""))
                {
                    update(_id, "" + EditText01.getText());
                    Button02.setEnabled(false);
                    Button03.setEnabled(false);
                }
            }
        });
        Button03.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                // TODO Auto-generated method stub
                if(_id != -1)
                {
                    delete(_id);
                    Button02.setEnabled(false);
                    Button03.setEnabled(false);
                }
            }
        });

        ListView01.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(android.widget.AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {
                // TODO Auto-generated method stub
                cursor.moveToPosition(arg2);
                _id=cursor.getInt(0);
                EditText01.setText(cursor.getString(1));

                Button02.setEnabled(true);
                Button03.setEnabled(true);
            }
        });

    }

    private void insert(String text)
    {
        //TO DO
        ContentValues cv=new ContentValues();
        cv.put(FIELD02_NAME,text);
        dataBase.insert(TABLENAME,null,cv);
        //cursor.requery();
        cursor=dataBase.query(TABLENAME,null,null,null,null,null,null);
        android.widget.SimpleCursorAdapter adapter = new android.widget.SimpleCursorAdapter(this, R.layout.list,
                cursor, new String[]
                {FIELD02_NAME}, new int[]
                {R.id.CheckedTextView01},0);
        ListView01.setAdapter(adapter);
        EditText01.setText("");
    }

    private void update(int id, String text)
    {
        //TO DO
        String where=FIELD01_NAME+"=?";
        String[] whereValue={Integer.toString(id)};
        ContentValues cv=new ContentValues();
        cv.put(FIELD02_NAME,text);
        dataBase.update(TABLENAME,cv,where,whereValue);
        //cursor.requery();
        cursor=dataBase.query(TABLENAME,null,null,null,null,null,null);
        android.widget.SimpleCursorAdapter adapter = new android.widget.SimpleCursorAdapter(this, R.layout.list,
                cursor, new String[]
                {FIELD02_NAME}, new int[]
                {R.id.CheckedTextView01},0);
        ListView01.setAdapter(adapter);
        EditText01.setText("");
    }

    private void delete(int id)
    {
        //TO DO
        String where=FIELD01_NAME+"=?";
        String[] whereValue={Integer.toString(id)};
        dataBase.delete(TABLENAME,where,whereValue);
        //cursor.requery();
        cursor=dataBase.query(TABLENAME,null,null,null,null,null,null);
        android.widget.SimpleCursorAdapter adapter = new android.widget.SimpleCursorAdapter(this, R.layout.list,
                cursor, new String[]
                {FIELD02_NAME}, new int[]
                {R.id.CheckedTextView01},0);
        ListView01.setAdapter(adapter);
        EditText01.setText("");
    }
}