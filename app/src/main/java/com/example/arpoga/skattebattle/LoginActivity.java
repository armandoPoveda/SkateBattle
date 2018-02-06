package com.example.arpoga.skattebattle;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class LoginActivity extends AppCompatActivity {

    private TextView view_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // no rotar la pantalla del Login
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //quitar actionBar LoginActivity
        getSupportActionBar().hide();

// Seteamos en una Variable donde tenemos la fuente (podemos omitir este paso y ponerla directamente cuando cargamos la fuente)
        String carpetaFuente = "fonts/Moonlight.ttf";

// Obtenemos la id del TextView donde queremos cambiar la fuente
        TextView vistaFuenteTitulo = findViewById(R.id.textViewTitulo);
        TextView vistaFuenteRegistro = findViewById(R.id.textView_Registrar);
        TextView vistaFuenteLogin = findViewById(R.id.textView_Login);

        // Cargamos la fuente
        Typeface fuente = Typeface.createFromAsset(getAssets(), carpetaFuente);

// Aplicamos la fuente
        vistaFuenteTitulo.setTypeface(fuente);
        vistaFuenteRegistro.setTypeface(fuente);
        vistaFuenteLogin.setTypeface(fuente);


        view_Login = findViewById(R.id.textView_Login);

        view_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginActivity.this, NavegationDrawerActivity.class);
                startActivity(i);
            }
        });

    }
}
