package com.example.user.homework;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

//SQLiteOpenHelper�~�ӫإ߸�Ʈw
public class SQLitedb extends SQLiteOpenHelper {
	// ��Ʈw�W�r
	private static final String DBNAME = "DB";
	// ��Ʈw����
	private final static int DB_Ver = 1;
	// ��ƪ�W�r
	private static final String TABLENAME = "MYTABLE";
	// ���1�W�r
	private static final String FIELD01_NAME = "_id";
	// ���2�W�r
	private static final String FIELD02_NAME = "_text1";
	// �ŧi���
	public Cursor cursor;

	// �غc��Ʈw�M����
	public SQLitedb(Context context) {
		super(context, DBNAME, null, DB_Ver);
		// TODO Auto-generated constructor stub
	}

	// Android ���J�ɧ䤣���Ʈw�ɮ׮ɡA�N�|�إ߸�ƪ�(�P�ɷ|�إߥX��Ʈw)
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String create_sql = "CREATE TABLE " + TABLENAME + "(" + FIELD01_NAME
				+ " INTEGER PRIMARY KEY, " + FIELD02_NAME + " TEXT);";
		db.execSQL(create_sql);
	}

	// ��������s�ɡA�|�i���ܧ�
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		String drop_table1 = "drop table if exists " + TABLENAME;
		db.execSQL(drop_table1);
		onCreate(db);
	}

	// �s�W
	public void insert(String text) {
		// ���o���
		SQLiteDatabase db = getReadableDatabase();
		// �s�W���O
		// ��k1. insert into ��ƪ� values (�s�W��ƶ��ŦX���ƶq)
		// ��k2. insert into ��ƪ�(���W��) values (�u�b�����s�W���)
		// �p�G�O�[�J��r�ɫe��n�[�J'
		String insert = "insert into " + TABLENAME + "(_text1) values ('"
				+ text + "')";
		// �b��Ʈw���ϥΫ��O
		db.execSQL(insert);
		// ���Э��s�j�M
		cursor.requery();
	}

	// �d��
	public ArrayList<String> select() {
		SQLiteDatabase db = getReadableDatabase();
		// �j�M���O
		// select ��� from ��ƪ� *��������ƪ��N��
		// ���w�j�M���O
		// select ��� from ��ƪ� where ���=�Q�n�䪺���
		String selectQuery = "SELECT * FROM " + TABLENAME;
		// ���J��Ʈw���A������Ы��V���
		Cursor c = db.rawQuery(selectQuery, null);
		// �إ߰}�C
		ArrayList<String> text = new ArrayList<String>();
		// ��в���
		while (c.moveToNext()) {
			// �s�W��Ʀܰ}�C��
			text.add(c.getString(1));
		}
		cursor.requery();
		return text;
	}

	// �R��
	public void delete(int id) {
		SQLiteDatabase db = getReadableDatabase();
		// �R�����O
		// delete from ��ƪ�
		// ���w�R�����O
		// delete from ��ƪ� where ���=�Q�n�䪺���
		String delete = "delete from " + TABLENAME + " where _id=" + id;
		db.execSQL(delete);
		cursor.requery();
	}

	// ��s
	public void update(int id, String newtext) {
		SQLiteDatabase db = getReadableDatabase();
		// ��s���O
		// update ��ƪ� set �n���ܪ����=�n���ܪ��� where �j�M�����=�j�M������r
		String update = "update MYTABLE set _text1='" + newtext
				+ "' where _id=" + id;
		db.execSQL(update);
		cursor.requery();
	}

	public void curosr() {
		SQLiteDatabase db = getReadableDatabase();
		// ���o��ưO���A�ë��V���
		cursor = db.query(TABLENAME, null, null, null, null, null, null);
	}

}
