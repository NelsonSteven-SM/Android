package com.nelson.apppit2_clase1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textViewTitulo;
    TextView textViewDatos;
    Button buttonFacultad;
    Button buttonCodigo;
    Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitulo = findViewById(R.id.textview_titulo);
        textViewDatos = findViewById(R.id.edittext_datos);
        buttonFacultad = findViewById(R.id.button_facultad);
        buttonCodigo = findViewById(R.id.button_codigo);
        buttonReset = findViewById(R.id.button_reset);

    }

    public void Facultad_Ciencias(View view) {
        textViewDatos.setText("Alumno de Ciencias\n Cursando el 6to Ciclo");

    }

    public void Codigo(View view) {
        textViewDatos.setText("Nelson Steven Sanabio Maldonado\n 21 años \n Piscis \n");


    }
    public void Reset(View view){
        textViewDatos.setText("Pulsa un Botón de la parte Inferior");
    }
}
