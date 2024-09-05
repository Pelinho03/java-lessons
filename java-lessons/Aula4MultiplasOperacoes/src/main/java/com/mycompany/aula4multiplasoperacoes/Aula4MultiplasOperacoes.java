package com.mycompany.aula4multiplasoperacoes;

import java.util.Scanner;

public class Aula4MultiplasOperacoes {

    public static void main(String[] args) {
    Scanner dados=new Scanner(System.in);
        int numero;
        
        System.out.println("Indica um valor inteiro: ");
        numero=dados.nextInt();
        
        //nº de algarismos que comõem o nº inserido
        int numAlgarismos=String.valueOf(numero).length();
        //converte-se o inteiro para string e utiliza-se o método length para contar o nº de algarismos
        System.out.println("O n de algarismos e: " + numAlgarismos);
        
        //calcular a soma
        int soma=0;
        int aux=numero;
        while (aux!=0) {
            soma+=aux%10; //pega no nº e divide por 10 e obtemos o resto que somamos à soma
            aux/=10;//aux=aux/10
        }
        System.out.println("A soma dos algarismos da " + soma);
        
        //calcular media dos algarismos
        System.out.println("A media e  " + (soma/numAlgarismos));
        
        //calcular o nº invertido
       int numeroInvertido=Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
        System.out.println("O n invertido e " + numeroInvertido);
        
       //verificar se é uma capicua
       if(numero==numeroInvertido)
            System.out.println(" E uma capicua.");
       else
            System.out.println("Nao e uma capicua.");
       
       //verificar se o número é perfeito
       int somadivisores=0;
       for(int i=numero-1;  i>0; i--){
           if(numero%i==0)
               somadivisores+=i;
       }
       if(somadivisores==numero)
            System.out.println("On é perfeito!");
       else
            System.out.println("Nao é perfeito!");
       
    }
}
