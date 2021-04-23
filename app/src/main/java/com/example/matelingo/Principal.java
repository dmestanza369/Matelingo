package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {

    Button botonTercero;
    ImageView botonAtras;
    ImageView botonAyuda;
    ImageView botonAjustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonTercero = (Button) findViewById(R.id.botontercero);
        botonAtras = (ImageView) findViewById(R.id.botonatras);
        botonAyuda = (ImageView) findViewById(R.id.botonayuda);
        botonAjustes = (ImageView) findViewById(R.id.botonajustes);

        botonTercero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this,Tercero.class);
                setContentView(R.layout.activity_tercero);
                startActivity(intent);
                finish();
            }
        });

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Principal.this,MainActivity.class));
            }
        });

        botonAyuda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Principal.this,Informacion.class));
            }
        });

        botonAjustes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Principal.this,Ajustes.class));
            }
        });
    }
}