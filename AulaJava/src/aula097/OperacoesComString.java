
package aula097;


public class OperacoesComString {
    public static void main(String[] args) {
        String n="adailton";
        String nM=n.toUpperCase();
            System.out.println("maiscula="+nM);
                String nm= n.toLowerCase();
                    System.out.println("minusculo="+nm);
                    System.out.println("------------------------------");
                    String rec="senai cic é o melhor do brasil";
                        String sub= rec.substring(6,30  );
                            System.out.println("sub="+sub);
                                String rep= rec.replace("brasil","mundo");
                                    System.out.println("Replace="+rep);
                                    System.out.println("------------------------");
                                        int loc= rec.indexOf("ai");
                                        
                                        System.out.println("localizado"+loc);
                                        loc=rec.lastIndexOf("si");
                                        System.out.println("localizado"+loc);
                                        System.out.println("-----------------------------");
                                            String sp= "laranja maça banana";
                                                String[] vect = sp.split(" ");
                                                String word1= vect [0];
                                                String word2= vect [1];
                                                String word3= vect [2];
                                                System.out.println(""+word1);
                                                System.out.println(""+word2);
                                                System.out.println(""+word3);
    }           
    
}
