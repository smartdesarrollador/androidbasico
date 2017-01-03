package com.example.sistema.myappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if( i == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
                }else if(i == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
                }else if(i == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
