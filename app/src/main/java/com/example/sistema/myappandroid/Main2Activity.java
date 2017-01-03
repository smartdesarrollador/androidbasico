package com.example.sistema.myappandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    // Declaracion de Variables
        TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Obtener Ids de Actividad Actual
        texto = (TextView) findViewById(R.id.texto);

        //Obtener Intent
        Intent intent = getIntent();

        //Obtener Extras de Intent
        Bundle extras = intent.getExtras();

        if(extras!=null){
            String cadena = (String) extras.get("DATO");
            texto.setText(cadena);

            
        }




    }
}
