package com.mycompany.aula7vetor;

import java.util.Scanner;

public class Aula7Vetor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[] inteiros = new int[10];

        System.out.println("Insercao dos elementos do array");

        /*forma mais curta do ciclo for seria
        for(int i : inteiros) */
        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("\nInsere o " + (i + 1) + "o valor: ");
            inteiros[i] = leia.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < inteiros.length; i++) {
            soma += inteiros[i];
            //soma += i;
        }
        System.out.println("\nA soma dos inteiro e: " + soma);

        System.out.printf("\nA media dos inteiro e:  %.2f", (double) (soma / inteiros.length));

        int max = inteiros[0];
        for (int i = 1; i < inteiros.length; i++) {
            if (max < inteiros[i]) {
                max = inteiros[i];
                /* if (max > inteiros[i]) {
                   max = inteiros[i];
                 */
            }
        }
        System.out.println("\n\nO maior valor do vetor e: " + max);

        System.out.println("\nIndica o valor sobre o qual queres o numero de ocorrencias: ");
        int valor = leia.nextInt();
        int count = 0;
        for (int i = 0; i < inteiros.length; i++) {
            if (valor == inteiros[i]) {
                count += 1;
            }
        }
        System.out.println("O numero indicado ocorreu " + count + " vezes.");

    }
}
