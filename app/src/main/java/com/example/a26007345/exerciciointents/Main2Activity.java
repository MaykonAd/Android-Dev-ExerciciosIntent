package com.example.a26007345.exerciciointents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        texto = findViewById(R.id.Tela2);
        Bundle dados = getIntent().getExtras();
        String modelo = dados.getString("modeloAut");
        String potencia = dados.getString("potenciaMot");
        String distancia = dados.getString("distanciaKm");
        String litrovalor = dados.getString("litroGaso");
        String result = dados.getString("Resultado");
        texto.setText(modelo+ " " + potencia + " gasta " + result + " para percorrer "+distancia+" Km " + litrovalor+"Valor");

    }
    //public void


}
