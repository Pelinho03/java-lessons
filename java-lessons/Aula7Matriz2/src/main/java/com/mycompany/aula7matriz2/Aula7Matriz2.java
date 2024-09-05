package com.mycompany.aula7matriz2;

import java.util.Scanner;

public class Aula7Matriz2 {

    public static void somaDasColunas(int[][] matriz, int[] vetor, int m, int n) {

        for (int i = 0; i < n; i++) {
            vetor[i] = 0;
            for (int j = 0; j < m; j++) {
                vetor[i] += matriz[j][i];
            }
        }
    }

    public static void main(String[] args) {

        int m, n;
        Scanner leia = new Scanner(System.in);

        System.out.println("Indica o numero de linhas para a matriz: ");
        m = leia.nextInt();
        System.out.println("Indica o numero de colunas para a matriz: ");
        n = leia.nextInt();

        int[][] matriz = new int[m][n];
        int maior = 0, menor = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("\nMatriz [" + i + "]" + "[" + j + "] = ");
                matriz[i][j] = leia.nextInt();

                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("\nO maior valor e: " + maior);
        System.out.println("O menor valor e: " + menor);

        int[] vetor = new int[n];
        somaDasColunas(matriz, vetor, m, n);
        for (int i = 0; i < n; i++) {
            System.out.println("\nNa posicao " + i + " tem o valor de " + vetor[i]);
        }
    }
}
