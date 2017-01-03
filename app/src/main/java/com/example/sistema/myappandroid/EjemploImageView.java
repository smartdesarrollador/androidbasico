package com.example.sistema.myappandroid;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EjemploImageView extends AppCompatActivity implements View.OnClickListener {

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_image_view);

        imagen = (ImageView) findViewById(R.id.imageView);

        imagen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView:
                Intent ventana = new Intent(this,LinkIntent.class);
                startActivity(ventana);
                break;
        }
    }
}
