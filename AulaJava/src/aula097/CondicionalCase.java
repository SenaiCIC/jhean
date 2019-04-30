
package aula097;

import java.util.Scanner;


public class CondicionalCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Tecle um numero de 1 a 7: ");
        int dia= sc.nextInt();
        String dsemana;
            switch (dia){
                case 1:
                  dsemana="domingo";
                  break;
                case 2:
                    dsemana="segunda";
                    break;
                case 3:
                    dsemana="terça";
                    break;
                case 4:
                    dsemana="quarta";
                    break;
                case 5:
                    dsemana="quinta";
                    break;
                case 6:
                    dsemana="sexta";
                    break;
                case 7:
                    dsemana="sabado";
                    break;
                default:
                    dsemana="numero invalido";
            }
            System.out.println(dsemana);     
            sc.close();         
            }
}