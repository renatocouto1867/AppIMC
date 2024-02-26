package com.example.appimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public String resultado;
    private EditText editTextNome;
    private EditText editTextPeso;
    private EditText editTextAltura;
    private Button buttonCalcular;
    private Button buttonLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonLimpar = findViewById(R.id.buttonLimpar);


        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = (Calculos.classificaIMC(Double.parseDouble(editTextAltura.getText().toString()),
                        Double.parseDouble(editTextPeso.getText().toString())));
                Intent intent = new Intent(MainActivity.this, ActivityResultado.class);
                intent.putExtra("imc", resultado);
                intent.putExtra("nome", editTextNome.getText().toString());
                startActivity(intent);

            }
        });

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextPeso.setText("");
                editTextAltura.setText("");
                editTextNome.setText("");  // Opcional: limpar também o resultado
            }
        });


    }//onCreate
}