package com.databese;

import com.model.Users;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLhelper extends SQLiteOpenHelper {

	Context context;
	String dbname;
	
	public SQLhelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		
		this.dbname = name;
		this.context = context;
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// 
		db.execSQL(new Users().CREAT_TABLE_USER);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL(new Users().CREAT_TABLE_USER);
	}

	  public boolean insertContact (String name, String password, String email) {
	      SQLiteDatabase db = this.getWritableDatabase();
	      ContentValues contentValues = new ContentValues();
	      
	      contentValues.put(new Users().COLUMN_USERNAME_USER,name);
	      contentValues.put(new Users().COLUMN_PASSWORD_USER,password);
	      contentValues.put(new Users().COLUMN_TYPE_USER, email);
	   
	      db.insert("contacts", null, contentValues);
		return true;
	      
	   }
	  public boolean checkAkun(String name){
		  //memasukan 1 parameterjika nama memiliki kesamaan dengasn data yang sudah disimpan 
		  //anti duplikasi
		  SQLiteDatabase db = this.getReadableDatabase();
		  Cursor res = db.COLUMN_USERNAME_USER+name,null);
		  
		  
		  
	  }
}
