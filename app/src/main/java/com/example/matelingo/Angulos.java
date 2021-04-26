package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Angulos extends AppCompatActivity {

    ImageView botonAtras;
    Button botonEjer1;
    Button botonEjer5;
    Button botonEjer10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angulos);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonAtras = (ImageView) findViewById(R.id.botonatras);
        botonEjer1 = (Button) findViewById(R.id.botonejer1);
        botonEjer5 = (Button) findViewById(R.id.botonejer5);
        botonEjer10 = (Button) findViewById(R.id.botonejer10);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Angulos.this,Tercero.class));
            }
        });

        botonEjer1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Angulos.this,Ejer1Angulos.class);
                setContentView(R.layout.activity_ejer1_angulos);
                startActivity(intent);
                finish();
            }
        });

        botonEjer5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Angulos.this,Ejer5Angulos.class);
                setContentView(R.layout.activity_ejer5_angulos);
                startActivity(intent);
                finish();
            }
        });

        botonEjer10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Angulos.this,Ejer10Angulos.class);
                setContentView(R.layout.activity_ejer10_angulos);
                startActivity(intent);
                finish();
            }
        });

    }
}