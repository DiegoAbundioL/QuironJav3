package com.proyecto.quironjav3;

import static com.proyecto.quironjav3.R.id.btnAvanzado;
import static com.proyecto.quironjav3.R.id.btnPrincipiante;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class Pag2 extends AppCompatActivity {

    Button btnPrin;
    Button btnAvan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);

        btnPrin=findViewById(R.id.btnPrincipiante);
        btnPrin.setOnClickListener(view -> {
            Intent i = new Intent(Pag2.this, Pag4.class);
            startActivity(i);
        });

        btnAvan=findViewById(R.id.btnAvanzado);
        btnAvan.setOnClickListener(view -> {
            Intent o = new Intent(Pag2.this, Pag3.class);
            startActivity(o);
        });
    }
}

