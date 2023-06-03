package com.proyecto.quironjav3;

import static com.proyecto.quironjav3.R.id.btnSigPg4;
import static com.proyecto.quironjav3.R.layout.activity_pag4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Pag4 extends AppCompatActivity {
    Button SigPagP4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_pag4);

        SigPagP4 = findViewById(R.id.btnSigPg4);
        SigPagP4.setOnClickListener(view -> {
            Intent pag4 = new Intent(Pag4.this, Pag5.class);
            startActivity(pag4);
        });
    }
}