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
    //private TextView text;

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

        if(pontecia <= 1.0){
            mult = 13;
        }else if(pontecia > 1.0 && pontecia < 1.4 ){
            mult = 11;
        }else if(pontecia > 1.4 && pontecia < 1.9){
            mult = 9.5;
        }else{
            mult = 7.75;
        }

        resultado = (mult/distancia)*litroValor;
        System.out.println(resultado);
        System.out.println(distancia); System.out.println(litroValor);
        DecimalFormat d = new DecimalFormat("00.00");
        String res = d.format(resultado);


        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("modeloAut",modeloAut.getText().toString());
        i.putExtra("potenciaMot",potenciaMot.getText().toString());
        i.putExtra("distanciaKm",distanciaKm.getText().toString());
        i.putExtra("litroGaso",litroGaso.getText().toString());
        i.putExtra("Resultado",res);
        System.out.println(res);
        startActivity(i);
    }
}
