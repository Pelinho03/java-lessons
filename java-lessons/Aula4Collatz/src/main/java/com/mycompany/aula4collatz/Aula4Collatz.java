package com.mycompany.aula4collatz;

import java.util.Scanner;

public class Aula4Collatz {

    public static void main(String[] args) {
        Scanner dados=new Scanner(System.in);
        int valinicial;
        
        System.out.println("Indica um valor inteiro: ");
        valinicial=dados.nextInt();

        while(valinicial>1) {
                if(valinicial%2==0) { //par
                    valinicial/=2; //mesma coisa que valinicial=valinicial/2
                 }else { //impar
                    valinicial=valinicial*3+1;
                }
                System.out.println(valinicial);
        }
    }
 }
