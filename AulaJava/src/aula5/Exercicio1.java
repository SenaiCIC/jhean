
package aula5;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
            System.out.println("Digite um numero:");
            int x =rc.nextInt();
                System.out.println("Digite um numero:");
                int y =rc.nextInt();
                    int resultado;
                        resultado= x+y;
                        System.out.println("A soma é: "+resultado);
                rc.close();
    }
    
}
