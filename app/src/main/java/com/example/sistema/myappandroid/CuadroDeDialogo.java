package com.example.sistema.myappandroid;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CuadroDeDialogo extends AppCompatActivity {
    Button boton;
    Context contexto = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadro_de_dialogo);

        boton = (Button) findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(contexto);
                alertDialogBuilder.setMessage("Mensaje")
                .setCancelable(false)
                        .setPositiveButton("SI", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int which){
                                // LO QUE QUIERAS HACER CUANDO SE DA CLICK A SI
                            }
                                })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int which){
                                // LO QUE QUIERAS HACER CUANDO SE DA CLICK A NO
                            }
                        });

                       AlertDialog alertDialog = alertDialogBuilder.create();
                          alertDialog.show();
            }
        });
    }
}
