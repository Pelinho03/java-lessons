
package com.mycompany.aula3operadorternario;

import java.util.Scanner;

public class Aula3OperadorTernario {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota;
        String saida;
        
        System.out.println("Insira a nota:");
        nota=entrada.nextInt();
        
        //com a condição if
        if(nota>=10)
            System.out.println("Parabéns!");
        else
            System.out.println("Marque novo exame.");
        
        //com o operador ternario
        saida=(nota>=10)?"Parabéns!":"Marque novo exame.";
        System.out.println(saida);
        
        //tudo numa só instrução
        System.out.println(nota>=10?"Parabéns!":"Marque novo exame.");
    }
} 
