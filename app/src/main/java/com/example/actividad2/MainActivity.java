package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtValue1;
    TextView txtValue2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obj xml
        txtValue1 = findViewById(R.id.txt1);
        txtValue2 = findViewById(R.id.txt2);
        txtResult = findViewById(R.id.txtR);
    }

    Calculadora obj = new Calculadora();

    @SuppressLint("SetTextI18n")
    public void suma(View v) {

        int num1 = Integer.parseInt(txtValue1.getText().toString());
        int num2 = Integer.parseInt(txtValue2.getText().toString());

        obj.setNum1(num1);
        obj.setNum2(num2);

        txtResult.setText("Resultado: " + obj.suma());
    }

    @SuppressLint("SetTextI18n")
    public void resta(View v) {

        int num1 = Integer.parseInt(txtValue1.getText().toString());
        int num2 = Integer.parseInt(txtValue2.getText().toString());

        obj.setNum1(num1);
        obj.setNum2(num2);

        txtResult.setText("Resultado: " + obj.resta());
    }

    @SuppressLint("SetTextI18n")
    public void multiplicacion(View v) {

        int num1 = Integer.parseInt(txtValue1.getText().toString());
        int num2 = Integer.parseInt(txtValue2.getText().toString());

        obj.setNum1(num1);
        obj.setNum2(num2);

        txtResult.setText("Resultado: " + obj.multiplicacion());
    }

    @SuppressLint("SetTextI18n")
    public void division(View v) {

        int num1 = Integer.parseInt(txtValue1.getText().toString());
        int num2 = Integer.parseInt(txtValue2.getText().toString());

        obj.setNum1(num1);
        obj.setNum2(num2);

        txtResult.setText("Resultado: " + obj.division());
    }

    @SuppressLint("SetTextI18n")
    public void limpiar(View v) {

        txtValue1.setText("");
        txtValue2.setText("");
        txtResult.setText("Resultado");
    }
}