package com.example.sistema.myappandroid;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sistema on 4/01/2017.
 */

public class FragmentB extends Fragment {

    View rootView;
    TextView output;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIstanceState){
        rootView = inflater.inflate(R.layout.fragmentb,container,false);
        output = (TextView) rootView.findViewById(R.id.output);

        return rootView;
    }

    public  void recibir(String msg){
        output.setText(msg);
    }
}
