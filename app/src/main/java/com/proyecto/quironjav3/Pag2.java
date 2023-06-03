package com.proyecto.quironjav3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class Pag2 extends AppCompatActivity {

    Button btnPrin;
    Button btnAvan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag2);

        btnPrin=findViewById(R.id.btnPrincipiante);
        btnPrin.setOnClickListener(view -> {
            Intent p = new Intent(Pag2.this, Pag4.class);
            startActivity(p);
        });

        btnAvan=findViewById(R.id.btnAvanzado);
        btnAvan.setOnClickListener(view -> {
            Intent ia = new Intent(Pag2.this, Pag3.class);
            startActivity(ia);
        });
    }
}

