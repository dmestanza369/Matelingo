package com.example.matelingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.util.DisplayMetrics;

public class PopUp_Correcto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_pop_up__correcto);

        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;

        getWindow().setLayout((int)(alto), (int)(ancho * 0.2));
    }
}