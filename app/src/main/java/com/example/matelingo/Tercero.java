package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tercero extends AppCompatActivity {

    Button botonSumas;
    ImageView botonAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercero);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        botonSumas = (Button) findViewById(R.id.botonsumas);
        botonAtras = (ImageView) findViewById(R.id.botonatras);

        botonSumas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Tercero.this,Sumas.class);
                setContentView(R.layout.activity_sumas);
                startActivity(intent);
                finish();
            }
        });

        botonAtras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(Tercero.this,Principal.class));
            }
        });

    }
}