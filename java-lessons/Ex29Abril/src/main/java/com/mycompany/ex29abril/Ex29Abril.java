package com.mycompany.ex29abril;

import java.util.Scanner;

public class Ex29Abril {

    public static void main(String[] args) {

        /*EXERCICIO 1
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Soma dos elementos do array = " + sum);*/
        //--------------------------------------------------------------------------------
        //Variante pedindo os valores do array
        /*Scanner leia = new Scanner(System.in);

        System.out.println("Indica o tamanho do array: ");
        int tamanho = leia.nextInt();

        int[] arr = new int[tamanho];

        System.out.println("Indica os valores do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            arr[i] = leia.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Soma dos elementos do array = " + sum);*/
        //--------------------------------------------------------------------------------
        //EXERCICIO 2
        /*Scanner leia = new Scanner(System.in);

        System.out.println("Indica o tamanho do array: ");
        int tamanho = leia.nextInt();

        int[] arr = new int[tamanho];

        System.out.println("Digita os valores do array: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            arr[i] = leia.nextInt();
        }

        System.out.println("Os elementos do array na ordem inversa sao:");
        for (int i = tamanho-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }*/
        //--------------------------------------------------------------------------------
        //EXERCICIO 3
        /*Scanner leia = new Scanner(System.in);

        System.out.println("Define o tamanho do array: ");
        int tamanho = leia.nextInt();

        int[] arr = new int[tamanho];

        System.out.println("Indica os valores a incluir no array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Valor: " + (i + 1) + ": ");
            arr[i] = leia.nextInt();
        }

        System.out.println("Digita o elemento a ser encontrado: ");
        int elemento = leia.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (arr[i] == elemento) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Elemento " + elemento + " encontrado no array.");
        } else {
            System.out.println("Elemento " + elemento + " nao encontrado no array.");
        }*/
        //--------------------------------------------------------------------------------
        //EXERCICIO 4
        Scanner leia = new Scanner(System.in);

        System.out.println("Digita o primeiro numero:");
        int num1 = leia.nextInt();

        System.out.println("Digita o segundo numero:");
        int num2 = leia.nextInt();

        int produto = 0;
        for (int i = 0; i < num2; i++) {
            produto += num1;
        }

        System.out.println("O produto de " + num1 + " e " + num2 + " = " + produto);
    }
}
