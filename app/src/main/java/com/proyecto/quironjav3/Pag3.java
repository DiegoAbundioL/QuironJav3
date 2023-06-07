package com.proyecto.quironjav3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Pag3 extends AppCompatActivity {

    Button btnSi1;
    Button btnNo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnSi1 = findViewById(R.id.btnSi);
        btnSi1.setOnClickListener(view -> {
            Intent pos = new Intent(Pag3.this, Pag4.class);
            startActivity(pos);
        });

        btnNo1 = findViewById(R.id.btnNo);
        btnNo1.setOnClickListener(view -> {
            Intent neg = new Intent(Pag3.this, Menu.class);
            startActivity(neg);
        });
    }

}