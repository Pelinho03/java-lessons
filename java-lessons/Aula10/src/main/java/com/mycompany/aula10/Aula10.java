package com.mycompany.aula10;

import java.util.Scanner;

public class Aula10 {

    public static void inverterString(String str) {
        StringBuilder nstr = new StringBuilder(str);
        nstr.reverse();
        System.out.println(nstr.toString());
    }

    public static void subCaracter(String str, char char1, char char2) {
        StringBuilder aux = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == char1) {
                aux.setCharAt(i, char2);
            }
        }
        System.out.println(aux.toString());
    }

    public static void main(String[] args) {
        char char1, char2;
        Scanner dados = new Scanner(System.in);

        System.out.println("Introduz uma string: ");
        String str = dados.nextLine();

        System.out.println("Indica a primeira letra.");
        char1 = dados.next().charAt(0);
        System.out.println("Indica a segunda letra.");
        char2 = dados.next().charAt(0);

        inverterString(str);
        subCaracter(str, char1, char2);
    }
}
