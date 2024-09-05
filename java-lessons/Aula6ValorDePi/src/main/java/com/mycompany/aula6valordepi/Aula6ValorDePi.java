package com.mycompany.aula6valordepi;

public class Aula6ValorDePi {

    public static double calcularSerie(int n) {
        double soma = 0.0;
        for (int i = 1; i < n; i++) {
            soma += 1.0 / Math.pow(i+2,3);
        }
        return soma;
    }

    public static double calcularPi(int n) {
        double serieS = calcularSerie(n);
        return Math.sqrt(serieS) * 32;
    }

    public static void main(String[] args) {

        int n = 20;
        double pi = calcularPi(n);
        System.out.println("Valor aproximado de Pi com " + n + " termos: " + pi);
    }
}
