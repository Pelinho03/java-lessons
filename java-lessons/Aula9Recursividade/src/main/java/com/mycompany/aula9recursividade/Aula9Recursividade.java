package com.mycompany.aula9recursividade;

public class Aula9Recursividade {

    public static void p(int n) {
        if (n > 0) {
            p(n - 2);
            System.out.print(n);
            p(n - 1);
        }
    }

    public static void main(String[] args) {
        p(4);
    }
}
