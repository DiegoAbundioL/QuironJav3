package com.proyecto.quironjav3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Pag5 extends AppCompatActivity {

    Button btnSigPag5;
    Button btnAntPag5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag5);

        btnSigPag5 = findViewById(R.id.btnSigPg5);
        btnSigPag5.setOnClickListener(view -> {
            Intent spg5 = new Intent(Pag5.this, Pag6.class);
            startActivity(spg5);
        });

        btnAntPag5 = findViewById(R.id.btnAntPg5);
        btnAntPag5.setOnClickListener(view -> {
            Intent apg5 = new Intent(Pag5.this, Pag4.class);
            startActivity(apg5);
        });
    }

}