
package com.mycompany.aula3descontoproduto;

import java.util.Scanner;

public class Aula3DescontoProduto {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String classe;
        
        System.out.println("Insira as tres primeiras letras: ");
        classe=entrada.nextLine(); //recebe tudo o que o utilizador escreve até o momento do enter
        
        //versão mais completa
       /* switch (classe) {
            case "Veg":  System.out.println("Desconto de 0.15"); break;
            case "Lat":
            case "Cer":
            case "Agu":  System.out.println("Desconto de 0.10");  break;       
            default: System.out.println("Desconto de 0.01");*/
            
            //versão compactada
            switch (classe) {
            case "Veg" -> System.out.println("Desconto de 0.15");
            case "Lat", "Cer", "Agu" -> System.out.println("Desconto de 0.10");
            default -> System.out.println("Desconto de 0.01");
        }

             
    }
}
