
package com.mycompany.aula4estacoes;

import java.util.Scanner;

public class Aula4Estacoes {

    public static void main(String[] args) {
  Scanner leia=new Scanner(System.in);
        int opcao, mes=0, dia=0;
        boolean mesdiadefinidos= false;
                
        do {
        
        System.out.println("(1) Inserir o mês");
        System.out.println("(2) Primavera");
        System.out.println("(3) Verão");
        System.out.println("(4) Outono");
        System.out.println("(5) Inverno");
        System.out.println("(6) Sair");
        opcao=leia.nextInt();
        
        switch (opcao) {
            case 1:
                do {
                System.out.println("Insere o nº do mês: ");
                   mes=leia.nextInt();
                   if(mes==3 || mes==6 || mes==9 || mes==12);  {        
                    do {
                        System.out.println("Insere o dia: ");
                        dia=leia.nextInt();
                    }while(dia<1 || dia>31);
                    }
                }while(mes<1 || mes>12);
                mesdiadefinidos= true;
                break;
                            
            case 2://primavera (20MAR, 19JUN)
                if (mesdiadefinidos) {
                    if(mes==4 || mes==5 || (mes==3 && dia>19) || (mes==6 && dia<20))
                        System.out.println("A estação está correta!");
                else
                    System.out.println("O mês pertence a outra estação do ano! Tenta novamente.");
                }else
                     System.out.println("Não é possivel, pois ainda não definiu mes/dia.");
                break;
                
            case 3://verão (20JUN, 21SET)
                if (mesdiadefinidos) {
                    if(mes==7 || mes==8 || (mes==6 && dia>19) || (mes==9 && dia<22))
                        System.out.println("A estação está correta!");
                else
                    System.out.println("O mês pertence a outra estação do ano! Tenta novamente.");
                }else
                     System.out.println("Não é possivel, pois ainda não definiu mes/dia.");
                break;
                
            case 4://outono (22SET, 20DEZ)
                if (mesdiadefinidos) {
                    if(mes==10 || mes==11 || (mes==9 && dia>21) || (mes==12 && dia<21))
                        System.out.println("A estação está correta!");
                else
                    System.out.println("O mês pertence a outra estação do ano! Tenta novamente.");
                }else
                     System.out.println("Não é possivel, pois ainda não definiu mes/dia.");
                break;
                
            case 5://inverno (21DEZ, 19MAR)
                if (mesdiadefinidos) {
                    if(mes==1 || mes==2 || (mes==12 && dia>20) || (mes==3 && dia<20))
                        System.out.println("A estação está correta!");
                else
                    System.out.println("O mês pertence a outra estação do ano! Tenta novamente.");
                }else
                     System.out.println("Não é possivel, pois ainda não definiu mes/dia.");
                break;
                
            case 6://sair
                System.out.println("Fim do programa!");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        }while(opcao!=6);
    }
}
