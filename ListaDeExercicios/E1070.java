package ListaDeExercicios;

import java.util.Scanner;



public class E1070 {
    public static void main(String[] args){
        Scanner vai= new Scanner(System.in);
        
    System.out.println("Digite um numero inteiro positivo:");
    int x = vai.nextInt();
     System.out.println("\n\n");
    
    if (x%2==0)
       x++;
    
    int i=x+12;
    
    for(x=x;x<i;x=x+2)
         System.out.println(x);
        
        
    }
    
}
