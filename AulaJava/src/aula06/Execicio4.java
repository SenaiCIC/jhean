
package aula06;

import java.util.Scanner;


public class Execicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("me de nota ai vei");
            double nota1= sc.nextDouble();
                System.out.println("manda otaaa");
                   double nota2= sc.nextDouble();
                        System.out.println("mostra a utima");
                            double nota3= sc.nextDouble();
                                System.out.println("zoei mais uma");
                                  double nota4= sc.nextDouble();
                             double res= (nota1+nota2+nota3+nota4)/4;
                                if(res<5){
                                    System.out.println("vai fica ficar sem free fire");
                                }
                                if(res>=5 && res<6){
                                    System.out.println("recuperação");
                                }
                                if(res>6){
                                    System.out.println("aprovado");
                                }
                                if(res>9){
                                    System.out.println("favela agradece");
                                }
                    
                    
                    
                    
                    sc.close();
    }
    
}
