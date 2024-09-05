package com.mycompany.aula8ex2;

import java.util.Scanner;

public class Aula8Ex2 {

    public static int contarStrings(String str, int contador, char prefixo) {
        char carater = str.charAt(0);
        if (carater == prefixo) {
            contador += 1;
        }

        return contador;

    }

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        String str;
        char prefixo;
        int contador = 0;

        System.out.println("Indique o prefixo: ");
        prefixo = dados.next().toUpperCase().charAt(0);//apenas um caracter depois de comvertido em maiusculas

        do {
            System.out.println("Indique uma string: ");
            str = dados.next().toUpperCase();// converte tudo em maiúsculas
            contador = contarStrings(str, contador, prefixo);

        } while (!str.equals("FIM")); // faz enquanto não for escrito "FIM" 

        System.out.println("O n de strings e: " + contador);
    }
}
