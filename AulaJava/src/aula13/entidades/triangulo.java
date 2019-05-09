
package aula13.entidades;


public class triangulo {
     public double a;
     public double b;
     public double c;
     public double p;
     public double area;
    public double caucalaarea(){
        p= (a+b+c)/2.0;
        area= Math.sqrt(p*(p-a)*(p-b)*(p-c));
    return area; 
    }
}
