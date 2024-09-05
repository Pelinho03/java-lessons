package com.mycompany.aula9fatorial;

import java.util.Scanner;

public class Aula9Fatorial {

    public static int fatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * fatorial(numero - 1);
    }

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int numero = -1;
        while (numero < 0) {
            System.out.println("Indique o n. que pretende obter do fatorial: ");
            numero = dados.nextInt();
            if (numero < 0) {
                System.out.println("O valor inserio tem que ser maior que 0.");
            }
        }
        int fat = fatorial(numero);
        System.out.println("O fatorial do n. que indicou e: " + fat);
    }
}
