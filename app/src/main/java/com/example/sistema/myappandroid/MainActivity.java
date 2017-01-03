package com.example.sistema.myappandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /* Declaracion de Variables */
           //Variable Para el Evento
               Button boton;

           //Variables para el Proceso
                TextView texto;
                EditText editText;



        /* Comienzo onCreate */
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            /* Obtener Ids */
                 //Obtener Id del boton para el Evento
                        boton = (Button) findViewById(R.id.boton);

                 //Obtener Ids Para el Proceso
                        texto = (TextView) findViewById(R.id.text);
                        editText = (EditText) findViewById(R.id.editText);




            /* Colocacion de Evento */
                  boton.setOnClickListener(this);

        } /* fin onCreate */

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.boton:

                Intent intent = new Intent(this,Main2Activity.class);

                String dato = editText.getText().toString();

                intent.putExtra("DATO",dato);
                startActivity(intent);
                break;

        } /* fin swith */

    } /* fin Onclick */



} /* fin MainActivity */





