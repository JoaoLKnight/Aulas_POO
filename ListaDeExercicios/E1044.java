package ListaDeExercicios;

import java.util.Scanner;

public class E1044 {
    public static void main(String[] args){
        Scanner vai= new Scanner(System.in);
        
        System.out.println("Digite dois numeros:");
        int A = vai.nextInt();
        int B = vai.nextInt();
        
        if (A>B){
            if(A%B==0){
                System.out.println ("São Multiplos!!!");
            }else 
                System.out.println ("Não são Multiplos!!!");
        }else {
            if(B%A==0){
                System.out.println ("São Multiplos!!!");
            }else 
                System.out.println ("Não são Multiplos!!!");
        }
            
    }
}
