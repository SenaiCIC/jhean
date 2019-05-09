
package aula13.aplicacao;

import aula13.entidades.triangulo;


public class programa {
    public static void main(String[] args) {
        
        double ax=0;
        double p=0;
        double py=0;
        double ay=0;
        triangulo x = new triangulo();
        x.a= 3.0;
        x.b= 5.0;
        x.c= 6.0;
            triangulo y = new triangulo();
            y.a=7.5;
            y.b=4.5;
            y.c=4.02;
                System.out.println("Medidas x :"+x.a+","+x.b+","+x.c);
                System.out.println("Medidas y :"+y.a+","+y.b+","+y.c);
                System.out.println("-------------");
                
                     ax= x.caucalaarea();
                     ay= y.caucalaarea();
                        System.out.println(ax);
                        System.out.println(ay);
                    
        
    }
    
}
