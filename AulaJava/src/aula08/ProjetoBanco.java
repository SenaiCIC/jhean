
package aula08;

import java.util.Scanner;


public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1-valor de deposito");
        double vd= sc.nextDouble();
        System.out.println("2-seu nome");
        String nome= sc.next();
        
        
        
        System.out.println("------------------------");
        System.out.println("1-novo depósito");
        System.out.println("2-Saque");
        System.out.println("3-Saldo");
        System.out.println("------------------------");
        int menu= sc.nextInt();
        
            switch (menu){
                case 1:
                    System.out.println("digite o deposito: ");
                       double dep= sc.nextDouble();
                       double resp = vd+dep;
                       System.out.println("seu saldo de agr é = "+resp);
                       break;
                case 2:
                    System.out.println("valor do saque");
                        double sq= sc.nextDouble();
                        double respI= vd-sq;
                        if(sq<=vd){
                        System.out.println("seu saldo de agr é = "+respI);
                        }
                        if(sq>vd){
                            System.out.println("se é probe");
                        }
                        
                        break;
                case 3: 
                    System.out.println(vd);
                    break;
            }
                    
                
                
                
                
                sc.close();
    }
}
