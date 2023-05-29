package com.proyecto.quironjav3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnOtraPagina;
    private EditText colocarNom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colocarNom = findViewById(R.id.colocarNombre);

        btnOtraPagina = findViewById(R.id.btnNombre);
        btnOtraPagina.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Pag2.class);
            startActivity(intent);
        });
    }
}