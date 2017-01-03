package com.example.sistema.myappandroid;

import android.support.annotation.CheckResult;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class EjemploCheckbox extends AppCompatActivity implements View.OnClickListener {

    Button boton;
    CheckBox checkR, checkA, checkAm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_checkbox);

        checkR = (CheckBox) findViewById(R.id.uno);
        checkA = (CheckBox) findViewById(R.id.dos);
        checkAm = (CheckBox) findViewById(R.id.tres);

        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        StringBuffer result = new StringBuffer();
        result.append("Rojo").append((checkR.isChecked()));
        result.append("Azul").append((checkA.isChecked()));
        result.append("Amarillo").append((checkAm.isChecked()));

        Toast.makeText(EjemploCheckbox.this, result.toString(),Toast.LENGTH_SHORT).show();

    }
}
