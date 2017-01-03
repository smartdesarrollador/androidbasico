package com.example.sistema.myappandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by sistema on 8/12/2016.
 */

import java.sql.SQLClientInfoException;




public class UsuariosSQLHelper extends SQLiteOpenHelper {
    String tabla="CREATE TABLE Usuarios(Id INTEGER PRIMARY KEY AUTOINCREMENT" +
            ",Nombre TEXT,Edad INTEGER)";

    public UsuariosSQLHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE Usuarios");
        db.execSQL(tabla);
    }
}
