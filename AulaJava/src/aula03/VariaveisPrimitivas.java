
package aula03;


public class VariaveisPrimitivas {
   
    public static void main(String[] args){
        String nome = "Jhean";
        int idade = 15;
        boolean escolha = true; //T F
        char sexo = 'M';       //Caracter
        char letra = '\u0059';      //Codigo Unicode
        byte n1 = 126;       //Numero
        int n2 = 1000;          //Inteiro
        long n4 = 135487569L;        //Inteiros maiores
        float n5 = 25.80f;       //decimais
        double n6 = 25.51;       //decimais duplos
        System.out.println(escolha);
        System.out.println(sexo);
        System.out.println(letra);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println("=========");
        System.out.printf("%.2f%n",n5);
        System.out.printf("%.5f%n",n6);
        System.out.println("Jhean");
        System.out.printf("%s tem %d anos%n",nome,idade);
    }

    public VariaveisPrimitivas() {
        
    }
    
}
