package com.mycompany.aula3ordenarnumeros;

import java.util.Scanner;

public class Aula3OrdenarNumeros {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Introduza o 1º número");
        x=entrada.nextInt();
        System.out.println("Agora introduz 2º número");
        y=entrada.nextInt();
        System.out.println("Introduz o 3º número");
        z=entrada.nextInt();
        
        //Podia ser usada esta a forma ou individualmente  
       /* else {
                if (x==y || x==z || y==z) {
                System.out.println("Há dois número iguais;");
                }
          }*/
        
        if (x==y && x==z)
            System.out.println("Todos os número são iguais.");
        else {
            if (x==z) {
                System.out.println("Há dois números iguais:" + x);
            }
            if (y==z) {
                System.out.println("Há dois números iguais;" + y);
            }    
            if (x==y) {
                System.out.println("Há dois números iguais;" + x);
            }           
            else {
                if(x>y && y>z) {
                    System.out.println(z + "<"  + y + "<" + x);
                }
                if(y>x && x>z) {
                    System.out.println(z + "<"  + x + "<" + y);
                }
                if(z>y && y>x) {
                    System.out.println(x + "<"  + y + "<" + z);
                }
                 if(y>z && z>x) {
                    System.out.println(x + "<"  + z + "<" + y);
                }
                 if(z>x && x>y) {
                    System.out.println(y + "<"  + x + "<" + z);
                }
                 if(x>z && z>y) {
                    System.out.println(y + "<"  + y + "<" + z);
                }
            }
         }
     }   
}