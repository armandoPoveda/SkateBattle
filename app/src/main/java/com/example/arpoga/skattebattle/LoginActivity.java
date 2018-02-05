package com.example.arpoga.skattebattle;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


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

    }
}
