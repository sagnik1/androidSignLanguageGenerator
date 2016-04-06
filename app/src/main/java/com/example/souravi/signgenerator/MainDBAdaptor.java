package com.example.souravi.signgenerator;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by souravi on 27/b/16.
 */
class MainDBAdaptor {

    DbAdaptor dbAdaptor;
    public MainDBAdaptor(Context context)
    {
        dbAdaptor= new DbAdaptor(context);
    }

    public long insertData(String username,String password)
    {
      SQLiteDatabase  sqLiteDatabase= dbAdaptor.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(DbAdaptor.dbusername,username);
        contentValues.put(DbAdaptor.dbpass, password);

        long ret= sqLiteDatabase.insert(DbAdaptor.tablename, null, contentValues);
        return ret;
    }

    public String selectfetch(String user, String pass)
    {
        SQLiteDatabase sqLiteDatabase= dbAdaptor.getWritableDatabase();
        String[] columns={DbAdaptor.dbusername,DbAdaptor.dbpass};
        StringBuffer stringBuffer=new StringBuffer();
        String[] arg={user,pass};
        Cursor cursor =sqLiteDatabase.query(DbAdaptor.tablename, columns, DbAdaptor.dbusername + "=? and " + DbAdaptor.dbpass + "=?", arg, null, null, null, null);
        while(cursor.moveToNext())
        {
            String uname = cursor.getString(cursor.getColumnIndex(DbAdaptor.dbusername));
            String password = cursor.getString(cursor.getColumnIndex(DbAdaptor.dbpass));
            stringBuffer.append(uname + ";" + password);
        }

         return stringBuffer.toString();

    }

    class DbAdaptor extends SQLiteOpenHelper{

        private static final String DatabaseName ="Users";
        private static final int DatabaseVersion = 1;
        private static final String tablename ="users";
        private static final String dbusername ="username";
        private static final String dbpass ="password";
        private static final String upgradeQ ="dop table if exists" + tablename + ";";
        private static final String createQuery = "CREATE TABLE " + tablename + "(" + dbusername + " VARCHAR(20)," + dbpass + " VARCHAR(20));";

        Context context1;

        public  DbAdaptor(Context context){
            super (context,DatabaseName, null, DatabaseVersion);
            context1=context;
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(createQuery);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(upgradeQ);
            onCreate(db);
        }
    }
    }
