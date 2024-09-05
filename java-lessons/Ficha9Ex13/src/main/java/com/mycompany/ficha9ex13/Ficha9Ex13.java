package com.mycompany.ficha9ex13;

import java.time.LocalDate;
import java.util.Scanner;

public class Ficha9Ex13 {

    public static int dataNiv2(int idade, int mes, int dia) {
        LocalDate currentdate = LocalDate.now();
        int anoAtual = currentdate.getYear();

        if (mes < 12 || (mes == 12 && dia < 31)) {
            anoAtual--;
        }
        return anoAtual - idade;
    }

    public static int dataNiv(int mes, int dia, int idade) {
        int data = 0;
        if (mes < 1 || mes > 12) {
            System.out.println("Valor invalido");
        } else {
            data = (((((((((((mes + 1) * 100) + dia) * 2) + 11) * 5) + 50) * 10) + idade) + 61) - 11111);
        }
        return data;
    }

    public static void main(String[] args) {
        int mes, dia, idade, opcao;
        Scanner leia = new Scanner(System.in);

        do {

            System.out.println("\nAdiciona o mes em que nasceu: ");
            mes = leia.nextInt();
            System.out.println("Insere o dia em que nasceu.");
            dia = leia.nextInt();
            System.out.println("Adiciona a idade.");
            idade = leia.nextInt();

            System.out.println("\n1 - Descobrir a minha idade e data de nascimento.");
            System.out.println("2 - Sair.");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    int data = dataNiv(mes, dia, idade);
                    int ano = dataNiv2(idade, mes, dia);
                    System.out.println("\nA idade e: " + data);
                    System.out.println("A data e: " + dia + "/" + mes + "/" + ano);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 2);

    }
}
