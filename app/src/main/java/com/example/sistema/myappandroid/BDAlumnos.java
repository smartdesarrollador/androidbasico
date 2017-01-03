package com.example.sistema.myappandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLClientInfoException;

/**
 * Created by sistema on 9/12/2016.
 */

public class BDAlumnos extends SQLiteOpenHelper{

    String sqlCreate = "CREATE TABLE Alumnos (codigo INTEGER, nombre TEXT)";
    String sqlCreate2 = "CREATE TABLE Alumnos (codigo INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT)";


    public BDAlumnos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(sqlCreate2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("DROP TABLE IF EXISTS Alumnos");

        db.execSQL(sqlCreate2);
    }
}
