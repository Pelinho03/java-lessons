
package com.mycompany.aula3calcularraiz;

import java.util.Scanner;

public class Aula3CalcularRaiz {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double a, b, c, disc, raiz1, raiz2;
                System.out.println("Introduza o valor A;" );
        a=entrada.nextInt();
                System.out.println("Introduza o valor B;" );
        b=entrada.nextInt();
                System.out.println("Introduza o valor C;" );
        c=entrada.nextInt();
        
        
      //pow é o calculo do b ao quadrado 
      //disc é o delta da função
      disc=Math.pow(b, 2)-4*a*c;
        
        //sqrt é para fazer a raiz do delta
        if (disc>=0) {
            raiz1=(-b+Math.sqrt(disc))/2*a;
            raiz2=(-b-Math.sqrt(disc))/2*a;
            System.out.printf("Raiz 1 = %6.2f\nRaiz 2 = %6.2f\n", raiz1, raiz2);
        }
        else {
                System.out.println("As raízes são imaginárias.");
                }
       
    }
}
