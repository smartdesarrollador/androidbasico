package com.example.sistema.myappandroid;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EjemploSqlite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_sqlite);
    }

    public void GuardarOnClick(View view){
        EditText nombre = (EditText) findViewById(R.id.ETNombre);
        EditText edad = (EditText) findViewById(R.id.ETEdad);
        UsuariosSQLHelper usdb = new UsuariosSQLHelper(this,"DBunab",null,1);
        SQLiteDatabase db = usdb.getWritableDatabase();
        try {
            String ins = "INSERT INTO Usuarios(Nombre,Edad) values ('" +
                    nombre.getText().toString()+"',"+edad.getText().toString()+")";
            db.execSQL(ins);
            Toast.makeText(this,"Datos Almacenados",Toast.LENGTH_LONG).show();

        }catch (Exception e){
            Toast.makeText(this,"Error:"+e.getMessage(),Toast.LENGTH_LONG).show();
        }finally {
            db.close();
        }
    }
}
