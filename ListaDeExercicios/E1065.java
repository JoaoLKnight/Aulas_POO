package ListaDeExercicios;

import java.util.Scanner;

public class E1065 {
    public static void main(String[] args){
        Scanner vai= new Scanner(System.in);
        int[] a = new  int[5];
        int aux=0;
        
        System.out.println ("Digite cinco numero diferentes:");
        for(int i=0;i<5;i++){
        a[i]=vai.nextInt();
        }
        
        for(int i=0;i<5;i++)
            if (a[i]%2==0){
               aux++;
            }
             
        System.out.println("São "+ aux +" numeros pares!!!");
            
    }
}
