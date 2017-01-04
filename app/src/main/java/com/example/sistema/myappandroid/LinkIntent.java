package com.example.sistema.myappandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinkIntent extends AppCompatActivity implements View.OnClickListener {

    Button spinner, toggle, cuadro, checkbox, scrollview,
            radiogroup, crudsqlite, tablelayout, imageview,
            fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_intent);

        spinner = (Button) findViewById(R.id.spinner);
        toggle = (Button) findViewById(R.id.toggle);
        cuadro = (Button) findViewById(R.id.cuadro);
        checkbox = (Button) findViewById(R.id.checkbox);
        scrollview = (Button) findViewById(R.id.scrollview);
        radiogroup = (Button) findViewById(R.id.radiogroup);
        crudsqlite = (Button) findViewById(R.id.crudsqlite);
        tablelayout = (Button) findViewById(R.id.tablelayout);
        imageview = (Button) findViewById(R.id.imageview);
        fragment = (Button) findViewById(R.id.fragment);



        spinner.setOnClickListener(this);
        toggle.setOnClickListener(this);
        cuadro.setOnClickListener(this);
        checkbox.setOnClickListener(this);
        scrollview.setOnClickListener(this);
        radiogroup.setOnClickListener(this);
        crudsqlite.setOnClickListener(this);
        tablelayout.setOnClickListener(this);
        imageview.setOnClickListener(this);
        fragment.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.spinner:
                Intent ventana = new Intent(this,Ejemplo_Spinner.class);
                startActivity(ventana);
                break;

            case R.id.toggle:
                Intent ventana2 = new Intent(this,Ejemplo_Toggle.class);
                startActivity(ventana2);
                break;

            case R.id.cuadro:
                Intent ventana3 = new Intent(this,CuadroDeDialogo.class);
                startActivity(ventana3);
                break;

            case R.id.checkbox:
                Intent ventana4 = new Intent(this,EjemploCheckbox.class);
                startActivity(ventana4);
                break;

            case R.id.scrollview:
                Intent ventana5 = new Intent(this,EjemploScrollview.class);
                startActivity(ventana5);
                break;

            case R.id.radiogroup:
                Intent ventana6 = new Intent(this,Main3Activity.class);
                startActivity(ventana6);
                break;

            case R.id.crudsqlite:
                Intent ventana7 = new Intent(this,CrudSqlite.class);
                startActivity(ventana7);
                break;

            case R.id.tablelayout:
                Intent ventana8 = new Intent(this,EjemploTable.class);
                startActivity(ventana8);
                break;

            case R.id.imageview:
                Intent ventana9 = new Intent(this,EjemploImageView.class);
                startActivity(ventana9);
                break;

            case R.id.fragment:
                Intent ventana10 = new Intent(this,ActivityFragments.class);
                startActivity(ventana10);
                break;
        }

    }
}
