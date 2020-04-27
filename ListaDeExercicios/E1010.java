package ListaDeExercicios;

import java.util.*;

public class E1010{
    public static void main (String[] args){
        
        Scanner vai= new Scanner (System.in);
        
        System.out.println("Digite o código da peca:");
        int cod1 = vai.nextInt();
        System.out.println("Digite a quantidade de pecas:");
        int qnt1 = vai.nextInt();
        System.out.println("Digite o preco das peca:");
        double pre1 = vai.nextDouble();
        
        System.out.println("Digite o código da peca:");
        int cod2 = vai.nextInt();
        System.out.println("Digite a quantidade de pecas:");
        int qnt2 = vai.nextInt();
        System.out.println("Digite o preco das peca:");
        double pre2 = vai.nextDouble();
        
       
        double total1= qnt1* pre1;
        
        double total2= qnt2* pre2;
        
        System.out.println ("O preço total da peca 1 (quantidade x preco):"+total1);
        System.out.println ("O preço total da peca 2 (quantidade x preco):"+total2);
        System.out.println ("TOTAL A PGARA: "+(total1+total2));
    }
    
}
