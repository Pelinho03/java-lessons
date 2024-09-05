package com.mycompany.ficha13ex1;

public class Ficha13Ex1 {

    public static void main(String[] args) {

        int numero = 2;
        int soma = 0;

        while (numero <= 99) {
            soma += numero;
            numero += 3;
            System.out.println(numero);
        }

       
        System.out.println("A soma dos numeros e: " + soma);
    }
}
