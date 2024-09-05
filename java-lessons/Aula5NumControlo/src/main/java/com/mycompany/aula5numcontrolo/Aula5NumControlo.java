package com.mycompany.aula5numcontrolo;

import java.util.Scanner;

public class Aula5NumControlo {

    public static int numAlg(int numero) {
        int numAlgarismos = String.valueOf(numero).length();
        //converte-se o inteiro para string e utiliza-se o método length para contar o nº de algarismos
        return numAlgarismos;
    }

    public static void digitoControlo(int numero) {
        int numeroalgarismos = numAlg(numero);
        int resto = numero, soma = 0, aux = numero;
        System.out.println("O n de algarismos e: " + numeroalgarismos);
        for (int i = 1; i <= numeroalgarismos; i++) {
            resto = aux % 10;
            aux /= 10;
            soma += resto * i;
            System.out.println(resto + "*" + i);
        }
        System.out.println("A soma da " + soma);
        int controlo = (soma % 7);
        System.out.println("O digito de controlo e: " + controlo);
        System.out.printf("O n + digito de controlo e: %d%d\n", numero, controlo);
    }

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int numero, opcao;

        System.out.println("Indica um valor inteiro: ");
        numero = dados.nextInt();

        do { //menu de opções
            System.out.println("/******************************************/");
            System.out.println("1 - Imprimir o n com digito de controlo.");
            System.out.println("/******************************************/");
            System.out.println("2 - Sair. *********************************/");
            System.out.println("/******************************************/");
            //possiveis formas de definir a variavel            
            //int opcao = dados.nextInt();
            //ou int opcao;
            opcao = dados.nextInt();

            switch (opcao) {
                case 1:
                    digitoControlo(numero);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 2);
    }
}
