package aula2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula2 {

    public static void main(String[] args) {
        double a;
        a=4.78905;
        double b=4.7,c=5.8954,d=5.0;
        
        System.out.println("/******************/");
        System.out.println("/*Teste com pintln*/");
        System.out.println("/******************/");
        
        System.out.println("aVriável A = " + a);
        System.out.println("Variável b = " + b);
        System.out.println("Variável C = " + c);
        System.out.println("Variável D = " + d + "\n");
        
        System.out.println("/*** Exercício 1***/");
        System.out.println("/*****************/");
        System.out.println("/*Teste com pintf*/");
        System.out.println("/*****************/");
        
        //%.2f 2 casas decimais formatadas 
        System.out.printf("Variável A = %.2f \n", a);
        System.out.printf("Variável B = %.2f \n", b);
        System.out.printf("Variável C = %.2f \n", c);
        System.out.printf("Variável D = %.2f \n", d);
        System.out.println("");
                
        System.out.println("/*************************/");
        System.out.println("/*Teste seguida de string*/");
        System.out.println("/*************************/");
        
        //%.2f 2 casas decimais formatadas com string apos variável de %
        System.out.printf("Variável A = %.2f %s", a, "%\n");
        System.out.printf("Variável A = %.2f%s", a, "%\n");
        
        System.out.println("");
        System.out.println("ERRO:");
        System.out.printf("Variável A = %.2f%s", a, "%\nVariável B =  %.2f%s", b, "%\n");
        
        System.out.println("");
        System.out.println("CORRETO:");
        System.out.printf("Variável A = %.2f%s %.2f%s", a, "%\nVariável B =", b, "%\n");
        
        System.out.println("");
        System.out.println("CORRETO V2:");
        System.out.printf("Variável A = %.2f%% \nVariável B = %.2f%% \nVariável C = %.2f%% \nVariável D = %.2f%% \n", a,b,c,d);
        
        System.out.println("");
        System.out.println("/*** Exercício 2***/");
        double e= 0.456789;
        System.out.printf("Variável E = %.3f%% \n", e*100);
        System.out.printf("Variável E = %.2f%% \n", e*100);
        System.out.printf("Variável E = %.1f%% \n", e*100);
        System.out.printf("Variável E = %.3f%% \nVariável E = %.2f%% \nVariável E = %.1f%% \n", e*100,e*100,e*100);
        
        System.out.println("");
        System.out.println("/*** Exercício 3***/");
        //%7.2f 7 caracteres totais e 2 casas decimais formatadas
        System.out.printf("Variável E = %7.2f%% \n", e*100);
        System.out.printf("Variável E = %10.2f%% \n", e*100);
        System.out.printf("Variável E = %3.2f%% \n", e*100);
        System.out.printf("Variável E = %7.2f%% \nVariável E = %10.2f%% \nVariável E = %3.2f%% \n", e*100,e*100,e*100);
        
        System.out.println("");
        System.out.println("/*** Exercício 4***/");
        Scanner leitura = new Scanner(System.in);
        System.out.println("/*********************/");
        System.out.println("Introduza o 1º número: ");
        double num1 =leitura.nextDouble();
        System.out.println("/*********************/");
        System.out.println("Introduza o 2º número: ");
        double num2 =leitura.nextDouble();
        double media= (num1+num2)/2;
        System.out.println("/*********************/");
        System.out.printf("A média é = %.3f\n ", media);
        System.out.println("/*********************/");
        
        System.out.println("");
        System.out.println("/*** Exercício 5***/");
        //abre em janelas
        /*double num3, num4, media2;
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 1º número"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 2º número"));
        media2 =(num3+num4)/2;
        JOptionPane.showMessageDialog(null, String.format("A média é = %.3f", media2));*/
        
        System.out.println("");
        System.out.println("/*** Exercício 6***/");
        //alinhado à esquerda sem formatação
        //%s string
        System.out.printf("%s %s \n", "Nome", "Morada");
        System.out.printf("%s %s \n", "Pedro", "Porto");
        System.out.printf("%s %s \n", "Ana", "Gaia");
        System.out.printf("%s %s \n", "Mariana", "Coimbra");
        
        System.out.println("");
        System.out.println("/*** Exercício 6b***/");
        //alinhado à esquerda formatado
        //%8s string com 8 caracteres
        System.out.printf("%-8s %-8s \n", "Nome", "Morada");
        System.out.printf("%-8s %-8s \n", "Pedro", "Porto");
        System.out.printf("%-8s %-8s \n", "Ana", "Gaia");
        System.out.printf("%-8s %-8s \n", "Mariana", "Coimbra");
        
        System.out.println("");
        System.out.println("/*** Exercício 7***/");
        //alinhado à direita formatado
        //%8s string com 8 caracteres
        System.out.printf("%8s %8s \n", "Nome", "Morada");
        System.out.printf("%8s %8s \n", "Pedro", "Porto");
        System.out.printf("%8s %8s \n", "Ana", "Gaia");
        System.out.printf("%8s %8s \n", "Mariana", "Coimbra");
        
        System.out.println("");
        System.out.println("/*** Exercício 8***/");
        JOptionPane.showMessageDialog(null, String.format("%-8s %8s \n", "Nome", "Morada")
                + String.format("%-8s %8s \n", "Pedro", "Porto")
                + String.format("%-8s %8s \n", "Ana", "Gaia")
                + String.format("%-8s %8s \n", "Mariana", "Coimbra"));     
    }
    
}
