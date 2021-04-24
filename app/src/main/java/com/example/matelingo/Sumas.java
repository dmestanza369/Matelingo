package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sumas extends AppCompatActivity {

    ImageView botonAtras;
    Button botonEjer1;
    Button botonEjer5;
    Button botonEjer10;
    int visited;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumas);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonAtras = (ImageView) findViewById(R.id.botonatras);
        botonEjer1 = (Button) findViewById(R.id.botonejer1);
        botonEjer5 = (Button) findViewById(R.id.botonejer5);
        botonEjer10 = (Button) findViewById(R.id.botonejer10);
        visited = Color.parseColor("#C78442");

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Sumas.this,Tercero.class));
            }
        });

        botonEjer1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sumas.this,Ejercicio1.class);
                setContentView(R.layout.activity_ejercicio1);
                startActivity(intent);
                finish();
                botonEjer1.setBackgroundColor(visited);
            }
        });

        botonEjer5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sumas.this,Ejercicio5.class);
                setContentView(R.layout.activity_ejercicio5);
                startActivity(intent);
                finish();
            }
        });

        botonEjer10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Sumas.this,Ejercicio10.class);
                setContentView(R.layout.activity_ejercicio10);
                startActivity(intent);
                finish();
            }
        });
    }
}