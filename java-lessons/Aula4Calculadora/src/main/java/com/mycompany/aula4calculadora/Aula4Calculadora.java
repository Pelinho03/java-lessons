
package com.mycompany.aula4calculadora;

import java.util.Scanner;

public class Aula4Calculadora {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int opcao;
        boolean operandosdefinidos= false;
        double oper1=0, oper2=0;
                
        do {
        
        System.out.println("(1) Inserir operandos");
        System.out.println("(2) Soma");
        System.out.println("(3) Subtração");
        System.out.println("(4) Multiplicação");
        System.out.println("(5) Divisão");
        System.out.println("(6) Sair");
        opcao=leia.nextInt();
        
        switch (opcao) {
            case 1:
                do {
                System.out.println("Insere o 1º valor: ");
                   oper1=leia.nextDouble();
                   System.out.println("Insere o 2º valor: ");
                   oper2=leia.nextDouble();
                   //se for menor que 1 ou menor ou igual a 0 (mesma coisa)
                   //if (oper<1 || oper<1)
                   if (oper1<=0 || oper2<=0)
                       System.out.println("Deve introduzir valor superiores a zero!");
               
                }while(oper1<=0 || oper2<=0);
                operandosdefinidos= true;
                break;
                            
            case 2://soma
                //Outra opção seria da seguinte forma
                /*double resultado=oper1+oper2;
                System.out.printf("%f + %f = %f", oper1, oper2, resultado);*/
                if (operandosdefinidos)
                    System.out.printf("%.2f + %.2f = %.2f\n", oper1, oper2, (oper1+oper2));
                else
                    System.out.println("Não é possivel, pois ainda não foram inseridos valores.");
                break;
                
            case 3://Subtração
                if (operandosdefinidos)
                    System.out.printf("%.2f - %.2f = %.2f\n", oper1, oper2, (oper1-oper2));
                else
                    System.out.println("Não é possivel, pois ainda não foram inseridos valores.");
                break;
                
            case 4://Multiplicação
                if (operandosdefinidos)
                    System.out.printf("%.2f * %.2f = %.2f\n", oper1, oper2, (oper1*oper2));
                else
                    System.out.println("Não é possivel, pois ainda não foram inseridos valores.");
                break;
                
            case 5://Divisão
                if (operandosdefinidos)
                    System.out.printf("%.2f / %.2f = %.2f\n", oper1, oper2, (oper1/oper2));
                else
                    System.out.println("Não é possivel, pois ainda não foram inseridos valores.");
                break;
                
            case 6:
                System.out.println("Fim do programa!");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        }while(opcao!=6);
    }
}