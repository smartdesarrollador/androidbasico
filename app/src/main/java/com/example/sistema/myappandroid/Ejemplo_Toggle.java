package com.example.sistema.myappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Ejemplo_Toggle extends AppCompatActivity {
 ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo__toggle);

        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(Ejemplo_Toggle.this,"TRUE",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Ejemplo_Toggle.this,"FALSE",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
