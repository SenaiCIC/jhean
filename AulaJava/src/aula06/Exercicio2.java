
package aula06;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nome:");
        String nome=sc.next();
        System.out.println("idade:");
        int idade=sc.nextInt();
        System.out.println("Peso:");
        double peso=sc.nextDouble();
        System.out.println("Altura:");
        double altura=sc.nextDouble();
            System.out.println("seu nome é: "+nome+",sua idade é: "+idade+ ",seu peso: "+peso+",sua altura: "+altura);
            double bang = peso/(altura*altura);
            System.out.println("e seu IMC é: "+bang);
        sc.close();
    }
    
}
