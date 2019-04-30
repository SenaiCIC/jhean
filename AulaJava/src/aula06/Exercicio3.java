
package aula06;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("que hrs vem o bonde");
         int hora= sc.nextInt();
          if(hora<12){
              System.out.println("Good morning");
          }
          if (hora>=12 && hora<18){
              System.out.println("Good afternoon");
          }
          if (hora>=18){
              System.out.println("Deus te proteja");
          }
        
        sc.close();
    }
    
}
