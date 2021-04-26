package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejer1Mult extends AppCompatActivity {

    ImageView botonAtras;
    Button respuestaCorrecta;
    Button fallo1;
    Button fallo2;
    Button fallo3;
    MediaPlayer mp;
    MediaPlayer mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer1_mult);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonAtras = (ImageView) findViewById(R.id.botonatras);
        respuestaCorrecta =  (Button) findViewById(R.id.respuestacorrecta);
        fallo1 =  (Button) findViewById(R.id.fallo1);
        fallo2 =  (Button) findViewById(R.id.fallo2);
        fallo3 =  (Button) findViewById(R.id.fallo3);
        mp = MediaPlayer.create(this, R.raw.acierto);
        mp2 = MediaPlayer.create(this, R.raw.fallo);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Ejer1Mult.this,Multiplicaciones.class));
            }
        });

        respuestaCorrecta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                mp.start();
                startActivity(new Intent(Ejer1Mult.this,PopUp_Correcto.class));
            }
        });

        fallo1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                mp2.start();
                startActivity(new Intent(Ejer1Mult.this,PopUp_Incorrecto.class));
            }
        });

        fallo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                mp2.start();
                startActivity(new Intent(Ejer1Mult.this,PopUp_Incorrecto.class));
            }
        });

        fallo3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                mp2.start();
                startActivity(new Intent(Ejer1Mult.this,PopUp_Incorrecto.class));
            }
        });
    }
}