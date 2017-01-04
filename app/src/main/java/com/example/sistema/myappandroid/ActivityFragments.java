package com.example.sistema.myappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFragments extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
    }

    @Override
    public void enviarDatos(String mensaje) {
        FragmentB fragment = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);

        fragment.recibir(mensaje);
    }
}
