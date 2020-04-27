package ListaDeExercicios;

import java.util.Scanner;

public class E1003 {
    public static void main (String[]args){
    
        Scanner vai= new Scanner(System.in);
        
       System.out.println("Digite um numero:");
       int a=vai.nextInt();
       
        System.out.println("Digite um numero:");
       int b=vai.nextInt();
       
       int total=a+b;
       
       System.out.println("O resultado da soma e = "+total);
    }
}
