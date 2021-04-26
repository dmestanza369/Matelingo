package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Multiplicaciones extends AppCompatActivity {

    ImageView botonAtras;
    Button botonEjer1;
    Button botonEjer5;
    Button botonEjer10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicaciones);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonAtras = (ImageView) findViewById(R.id.botonatras);
        botonEjer1 = (Button) findViewById(R.id.botonejer1);
        botonEjer5 = (Button) findViewById(R.id.botonejer5);
        botonEjer10 = (Button) findViewById(R.id.botonejer10);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Multiplicaciones.this,Tercero.class));
            }
        });

        botonEjer1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Multiplicaciones.this,Ejer1Mult.class);
                setContentView(R.layout.activity_ejer1_mult);
                startActivity(intent);
                finish();
            }
        });

        botonEjer5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Multiplicaciones.this,Ejer5Mult.class);
                setContentView(R.layout.activity_ejer5_mult);
                startActivity(intent);
                finish();
            }
        });

        botonEjer10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Multiplicaciones.this,Ejer10Mult.class);
                setContentView(R.layout.activity_ejer10_mult);
                startActivity(intent);
                finish();
            }
        });
    }
}