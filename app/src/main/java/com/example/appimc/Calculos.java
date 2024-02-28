package com.example.appimc;

import java.text.DecimalFormat;

public class Calculos {
    private static double calcularIMC(Double altura, Double peso) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format( peso / (altura * altura)));
    }

    public static String classificaIMC(Double altura, Double peso){
        double imc = calcularIMC(altura,peso);

        if (imc <18.5){
            return "Seu IMC é "+imc + ", Você esta abaixo do peso";
        }
        if (imc <25){
            return "Seu IMC é "+imc + ", Você esta com o peso adequado";
        }
        if (imc <30){
            return "Seu IMC é "+imc + ", Você esta sobrepeso";
        }
        if (imc <35){
            return "Seu IMC é "+imc + ", Você esta com obesidade grau 1";
        }
        if (imc <40){
            return "Seu IMC é "+imc + ", Você esta com obesidade grau 2";
        }
        return "Seu IMC é "+imc + ", Você esta com obesidade grau 3";
    }
}
