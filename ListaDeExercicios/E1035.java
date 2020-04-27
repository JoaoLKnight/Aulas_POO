package ListaDeExercicios;

import java.util.Scanner;

public class E1035 {
    public static void main (String[] args){
        Scanner vai = new Scanner (System.in); 
        
        System.out.println ("Digite 4 numeros: ");
        int A= vai.nextInt();
        int B= vai.nextInt();
        int C= vai.nextInt();
        int D= vai.nextInt();
        
        if (B>C && D>A){
            if (C+D>A+B)
                if (C>0 && D>0)
                    if (A%2==0)
                        System.out.println ("Valores Aceito!!!");
        }else 
            System.out.println("Valores não Aceitos!!!");     
    }
}
