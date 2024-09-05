package com.mycompany.aula5multiplasoperacoes;

import java.util.Scanner;

public class Aula5MultiplasOperacoes {

    public static int numAlg(int numero) {
        int numAlgarismos = String.valueOf(numero).length();
        //converte-se o inteiro para string e utiliza-se o método length para contar o nº de algarismos
        return numAlgarismos;
    }

    public static int soma(int numero) {
        int soma = 0;
        int aux = numero;
        while (aux != 0) {
            soma += aux % 10; //pega no nº e divide por 10 e obtemos o resto que somamos à soma
            aux /= 10;//aux=aux/10
        }
        return soma;
    }

    public static void perfeito(int numero) {
        int somadivisores = 0;
        for (int i = numero - 1; i > 0; i--) {
            if (numero % i == 0) {
                somadivisores += i;
            }
        }
        if (somadivisores == numero) {
            System.out.println("O nº e perfeito!");
        } else {
            System.out.println("Nao e perfeito!");
        }
        //não necessita de returno pois apresenta o print dentro do próprio método
    }

    public static int numeroInvertido(int numero) {
        int numeroInvertido = Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
        return numeroInvertido;
    }

    //no main vamos apenas apresentar os prints, já que todos os cálculos são efetuados dentro dos métodos
    //código mais organizado
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int numero;

        System.out.println("Indica um valor inteiro: ");
        numero = dados.nextInt();

        //nº de algarismos que comõem o nº inserido
        int numAlg = numAlg(numero); //guardar numa variável apenas para ser mais fácil inserir no print mas não seria necessário
        System.out.println("O n de algarismos e: " + numAlg);

        //calcular a soma
        int soma = soma(numero);
        System.out.println("A soma dos algarismos da " + soma);

        //calcular media dos algarismos
        System.out.println("A media e  " + (soma / numAlg));

        //calcular o nº invertido
        int numeroInvertido = numeroInvertido(numero);
        System.out.println("O n invertido e " + numeroInvertido);

        //verificar se é uma capicua
        if (numero == numeroInvertido) {
            System.out.println(" E uma capicua.");
        } else {
            System.out.println("Nao e uma capicua.");
        }

        //verificar se o número é perfeito
        perfeito(numero);
    }
}
