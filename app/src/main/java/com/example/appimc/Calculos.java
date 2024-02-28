package com.example.appimc;

import java.text.DecimalFormat;

public class Calculos {
    private static double calcularIMC(Double altura, Double peso) {

        return (peso / (altura * altura));
    }

    public static String classificaIMC(Double altura, Double peso) {
        double imc = calcularIMC(altura, peso);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        if (imc < 18.5) {
            return "Seu IMC é " + decimalFormat.format(imc) + "\nVocê esta abaixo do peso";
        }
        if (imc < 25) {
            return "Seu IMC é " + decimalFormat.format(imc) + "\nVocê esta com o peso adequado";
        }
        if (imc < 30) {
            return "Seu IMC é " + decimalFormat.format(imc) + "\nVocê esta sobrepeso";
        }
        if (imc < 35) {
            return "Seu IMC é " + decimalFormat.format(imc) + "\nVocê esta com obesidade grau 1";
        }
        if (imc < 40) {
            return "Seu IMC é " + decimalFormat.format(imc) + "\nVocê esta com obesidade grau 2";
        }
        return "Seu IMC é " + decimalFormat.format(imc) + "\nVocê esta com obesidade grau 3";
    }
}
