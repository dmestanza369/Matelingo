package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio1 extends AppCompatActivity {

    ImageView botonAtras;
    Button respuestaCorrecta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonAtras = (ImageView) findViewById(R.id.botonatras);
        respuestaCorrecta =  (Button) findViewById(R.id.respuestacorrecta);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Ejercicio1.this,Sumas.class));
            }
        });

        respuestaCorrecta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Ejercicio1.this,PopUp_Correcto.class));
            }
        });
    }
}