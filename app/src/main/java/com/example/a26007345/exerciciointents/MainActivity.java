package com.example.a26007345.exerciciointents;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText modeloAut;
    private TextInputEditText distanciaKm;
    private TextInputEditText potenciaMot;
    private TextInputEditText litroGaso;
    private double resultado;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modeloAut = findViewById(R.id.inputModeloAuto);
        distanciaKm = findViewById(R.id.inputDistanciaKm);
        potenciaMot = findViewById(R.id.inputPotenciaMotor);
        litroGaso = findViewById(R.id.inputValorGasolina);

    }
    public void AcaoButao(View acao){
        double pontecia = Double.parseDouble( potenciaMot.getText().toString());
        double distancia = Double.parseDouble(distanciaKm.getText().toString());
        double litroValor = Double.parseDouble(litroGaso.getText().toString());
        double mult;

        if(pontecia > 1.9){
            mult = 7.75;
        }else if(pontecia > 1.4 && pontecia <= 1.9 ){
            mult = 9.5;
        }else if(pontecia > 1.0 && pontecia <= 1.4){
            mult = 11.0;
        }else{
            mult = 13.0;
        }

        //resultado = (mult/distancia)*litroValor;
       // DecimalFormat d = new DecimalForm
        //d.format(resultado);

        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("Resultado",resultado);
        startActivity(i);
    }
}
