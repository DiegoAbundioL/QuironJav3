package com.proyecto.quironjav3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Se crea la variable btnOtraPagina
    Button btnOtraPagina;
    //Se crea la variable colocarNom
    private EditText colocarNom;
    //Se crea un String que funcione como el nombre
    private String nombre = "";
    //Método que crea la clase para correr el código
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se manda a llamar el EditText colocarNombre para darle una función
        colocarNom = (EditText) findViewById(R.id.colocarNombre);
        //Se manda a llamar el botón desde el xml para darle una función
        btnOtraPagina= (Button) findViewById(R.id.btnNombre);

        //Iniciará un serie de procesos al presionar el botón
        btnOtraPagina.setOnClickListener(new View.OnClickListener() {
            //Método
            @Override
            public void onClick(View v) {
                //La variable nombre se alojará en colocarNom
                nombre = colocarNom.getText().toString();

                //Si se colocó un nombre dará paso a otra página
                if(!nombre.isEmpty()){
                    Intent siguientePag  =new Intent(MainActivity.this, Pag2.class);
                    startActivity(siguientePag);
                }
                //Por lo contrario, arrojará un mensaje
                else{
                    Toast.makeText(MainActivity.this, "Agrega un nombre/usuario", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}