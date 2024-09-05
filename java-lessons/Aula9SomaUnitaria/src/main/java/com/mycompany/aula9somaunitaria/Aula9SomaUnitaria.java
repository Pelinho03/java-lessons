package com.mycompany.aula9somaunitaria;

import java.util.Scanner;

public class Aula9SomaUnitaria {

    public static int soma(int num1, int num2) {

        if (num2 == 0) {
            return num1;
        }
        System.out.println(num1 + " + 1 = " + (num1 + 1));
        System.out.println("O numero 2 passa a ter o valor: " + (num2 - 1));
        return soma(num1 + 1, num2 - 1);
    }

    //com um for
    /* for (int i = 0; i < num2; i++) {
            num1 = num1 + 1;
        }
        return num1;*/
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int num1 = -1, num2 = -1;

        while (num1 < 0) {
            System.out.println("Indique o 1o numero: ");
            num1 = dados.nextInt();
            if (num1 < 0) {
                System.out.println("Valor invalido.");
            }
        }

        while (num2 < 0) {
            System.out.println("Indique o 2o numero: ");
            num2 = dados.nextInt();
            if (num2 < 0) {
                System.out.println("Valor invalido.");
            }
        }

        System.out.println("A soma da: " + soma(num1, num2));

    }
}
