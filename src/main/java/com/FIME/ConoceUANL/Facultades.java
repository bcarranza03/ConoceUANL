package com.FIME.ConoceUANL;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Facultades extends AppCompatActivity {

    ImageButton fime,facdyc,facpya,farq,fcb,fcfm,fcq,ffyl,fic,fod,ftsydh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultades);


       fime =  findViewById(R.id.btnFime);
        facdyc = findViewById(R.id.btnFacdyc);
      facpya =  findViewById(R.id.btnFacpya);
        farq =  findViewById(R.id.btnFarq);
        fcb = findViewById(R.id.btnFcb);
        fcfm = findViewById(R.id.btnFcfm);
        fcq = findViewById(R.id.btnFcq);
         ffyl = findViewById(R.id.btnFfyl);
        fic = findViewById(R.id.btnFic);
     fod = findViewById(R.id.btnFod);
        ftsydh = findViewById(R.id.btnFtsydh);
        onFacultadPressed();
    }

    private void onFacultadPressed() {
        // FIME

        fime.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.725036, -100.313464));
            }
        });
        // FACDYC

        facdyc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.726444, -100.310603));
            }
        });
        // FACPYA

        facpya.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727317, -100.309144));
            }
        });

        // FARQ

        farq.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.725207, -100.312408));
            }
        });
        // FCB

        fcb.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.724253, -100.316370));
            }
        });
        // FCFM

        fcfm.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.725214, -100.315217));
            }
        });
        // FCQ

        fcq.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.724222, -100.315469));
            }
        });
        // FFYL

        ffyl.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727174, -100.310469));
            }
        });
        // FIC

        fic.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.724763, -100.314006));
            }
        });
        // FOD

        fod.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727557, -100.312470));
            }
        });
        // FTSYDH

        ftsydh.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(setIntentLocalizador(25.727834, -100.310081));
            }
        });

    }

    private Intent setIntentLocalizador(double lan, double lng) {
        Intent intent = new Intent(Facultades.this, Local.class);
        intent.putExtra("lan", lan);
        intent.putExtra("lng", lng);
        return intent;
    }
}
