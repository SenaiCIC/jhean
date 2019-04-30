
package aula5;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            
             System.out.println("Digite seu nome:");
             String nome= sc.next();
             String nomesobrenome=sc.nextLine();
              System.out.println("Seu nome é:"+nome+nomesobrenome);
                   
        sc.close();
    }
    
}
