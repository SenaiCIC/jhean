
package aula06;

import java.util.Scanner;


public class Condicionais {
    public static void main(String[] args) {
        
        //if(condição){
        //comando1
        //comando2
        //}
        //else{
        //comando1
        //comando2
        //}
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero inteiro");
            int num = sc.nextInt();
            int res = num%2;
                if(res==0){
                    System.out.println("0 numero é par");
                }else{
                    System.out.println("O numero é impar");
                }
        
        
        sc.close();
    }
    
}
