package com.example.appimc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ActivityResultado extends AppCompatActivity {
    public final int IMG_1 = R.drawable.img1;
    public final int IMG_2 = R.drawable.img2;
    public final int IMG_3 = R.drawable.img3;
    public final int IMG_4 = R.drawable.img4;
    private TextView textViewResultado;
    private TextView textViewPessoaNome;
    private ImageView imageViewIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textViewResultado = findViewById(R.id.textViewResultado);
        textViewPessoaNome = findViewById(R.id.textViewPessoaNome);
        imageViewIMC = findViewById(R.id.imageIMC);

        Random random = new Random();
        int imageId = random.nextInt(4) + 1;
        if (imageId == 1) {
            imageViewIMC.setImageResource(IMG_1);
        }
        if (imageId == 2) {
            imageViewIMC.setImageResource(IMG_2);
        }
        if (imageId == 3) {
            imageViewIMC.setImageResource(IMG_3);
        }
        if (imageId == 4) {
            imageViewIMC.setImageResource(IMG_4);
        }

        Intent intent = getIntent();
        if (intent != null) {
            textViewResultado.setText(intent.getStringExtra("imc"));
            textViewPessoaNome.setText(intent.getStringExtra("nome"));

        }

    }//onCreate
}