
package aula097;

import java.util.Scanner;


public class CondicionalCase {
    public static void main(String[] args) {
        //switch(minha variavel){
        //case1:
        //sout("caso1")
        //break
        //case2:
        //sout("caso2")
        //break
        //}default
        Scanner sc= new Scanner(System.in);
        int d = sc.nextInt();
        String dia;
            switch(d){
                case 1:
                    dia="domingo";
                    break;
                case 2:
                    dia="segunda";
                    break;
            }
        
        
        
        
        sc.close();
    }
    
}
