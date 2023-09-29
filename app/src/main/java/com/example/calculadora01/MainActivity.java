package com.example.calculadora01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.txt_nmb1);
        et2= (EditText) findViewById(R.id.editTextNumber);
        tv1= (TextView) findViewById(R.id.textViewresult);
        rb1= (RadioButton) findViewById(R.id.radioSumar);
        rb2= (RadioButton) findViewById(R.id.radioRestar);
        rb3= (RadioButton) findViewById(R.id.radioMultiplicar);
        rb4= (RadioButton) findViewById(R.id.radioDividir);


    }

    public void calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);


        if(rb1.isChecked()){
            int suma = num1+num2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        } else if (rb2.isChecked()) {
            int resta = num1-num2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        } else if (rb3.isChecked()) {
            int multiplicacion = num1*num2;
            String resultado = String.valueOf(multiplicacion);
            tv1.setText(resultado);
        } else if (rb4.isChecked()) {
            int division = num1 / num2;
            String resultado = String.valueOf(division);
            tv1.setText(resultado);
        }
    }
}