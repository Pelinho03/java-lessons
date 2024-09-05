package com.mycompany.aula8ex1;

import java.util.Scanner;

public class Aula8Ex1 {

    public static int contarStrings(String str, int contador) {
        char carater = str.charAt(0);// regista a primeira letra da palavra
        if (carater == 'A' || carater == 'B' || carater == 'C') {
            contador += 1;
        }

        return contador;

    }

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        String str;
        int contador = 0;

        do {
            System.out.println("Indique uma string: ");
            str = dados.nextLine().toUpperCase();// converte tudo em maiúsculas
            contador = contarStrings(str, contador);

        } while (!str.equals("FIM")); // faz enquanto não for escrito "FIM" 

        System.out.println("O n de strings e: " + contador);
    }
}
