package com.FIME.ConoceUANL;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Inicio extends AppCompatActivity {


    ImageButton btnCamara,btnLocal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        btnCamara = (ImageButton)findViewById(R.id.lector);
        btnLocal = (ImageButton) findViewById(R.id.localizador);


        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)!=(PackageManager.PERMISSION_GRANTED))
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
        }
        btnCamara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(Inicio.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });

        btnLocal.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(Inicio.this,Facultades.class));
            }
        });
    }
}
