package com.mycompany.aula7matriz1;

import java.util.Scanner;

public class Aula7Matriz1 {

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

        //outra opção seria assim, efetuando o maior e menor de fora
        /* int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
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
        }*/
    }
}
