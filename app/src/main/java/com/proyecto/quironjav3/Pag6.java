package com.proyecto.quironjav3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Pag6 extends AppCompatActivity {
    Button btnSigPag6;
    Button btnAntPag6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag6);

        btnSigPag6 = findViewById(R.id.btnSigPg6);
        btnSigPag6.setOnClickListener(view ->{
            Intent spg6 = new Intent(Pag6.this, Menu.class);
            startActivity(spg6);
        });

        btnAntPag6 = findViewById(R.id.btnAntPg6);
        btnAntPag6.setOnClickListener(view ->{
            Intent apg6 = new Intent(Pag6.this, Pag5.class);
            startActivity(apg6);
        });
    }
}