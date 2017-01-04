package com.example.sistema.myappandroid;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sistema on 4/01/2017.
 */

public class FragmentA extends Fragment  {

    View rootView;
    Button boton;
    EditText editText;
    EnviarMensaje EM;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragmenta,container,false);

        editText = (EditText) rootView.findViewById(R.id.input);
        boton = (Button) rootView.findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String dato = editText.getText().toString();
                EM.enviarDatos(dato);
            }


        });

        return rootView;
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);

        EM = (EnviarMensaje) activity;
    }


}
